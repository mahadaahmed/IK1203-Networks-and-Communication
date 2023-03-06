import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class MyRunnable implements Runnable{

private Socket socket;
  public MyRunnable(Socket socket) {
    this.socket = socket;
}

@Override
public void run() {
    try {
        OutputStream output = socket.getOutputStream();
        StringBuilder response = new StringBuilder();

        byte[] buffer = new byte[1024];
        socket.getInputStream().read(buffer);
        String outputString = new String(buffer, StandardCharsets.UTF_8);
        String[] lines = outputString.split("\n");
        System.out.println(lines[0].trim());
        System.out.println(lines[1].trim());

        String[] requestLines = outputString.split("\r\n");
        System.out.println(outputString);
        if (requestLines.length == 0 || !requestLines[0].startsWith("GET")
                || !requestLines[0].endsWith("HTTP/1.1")) {
            sendError(400, "Bad request: URI is missing", output);
            return;
        }

        String myURL = requestLines[0].split(" ")[1];
        String[] parameter = myURL.split("\\?");

        if (parameter.length > 0 && parameter[0].equals("/ask")) {
            if (parameter.length < 2) {
                sendError(400, "Bad Request", output);
                return;
            }

            String[] parameterArray = parameter[1].split("&");
            byte[] bytesToServer = new byte[0];
            String hostname = null;
            int portForClient = 0;
            boolean shutdown = false;
            Integer timeout = null;
            Integer limit = null;

            for (String param : parameterArray) {
                String[] keyValue = param.split("=");

                switch (keyValue[0]) {
                    case "shutdown":
                        shutdown = Boolean.parseBoolean(keyValue[1]);
                        break;
                    case "timeout":
                        timeout = Integer.parseInt(keyValue[1]);
                        break;
                    case "limit":
                        limit = Integer.parseInt(keyValue[1]);
                        break;
                    case "hostname":
                        hostname = keyValue[1];
                        break;
                    case "port":
                        portForClient = Integer.parseInt(keyValue[1]);
                        break;
                    case "string":
                        bytesToServer = keyValue[1].getBytes();
                        break;
                    default:
                        sendError(400, "Bad Request", output);
                        return;
                }

                if (keyValue.length < 2) {
                    sendError(400, "Bad Request", output);
                    return;
                }
            }

            if (hostname == null || portForClient == 0) {
                sendError(400, "Bad Request", output);
                return;
            }

            try {
                response.append("HTTP/1.1 200 OK\r\n\r\n");

                TCPClient client = new TCPClient(shutdown, timeout, limit);
                response.append(new String(client.askServer(hostname, portForClient, bytesToServer)));

            } catch (Exception e) {
                sendError(500, "Internal Server Error", output);
                return;
            }

        } else {
            sendError(404, "Not Found", output);
            return;
        }

        output.write(response.toString().getBytes());
        socket.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
}

private static void sendError(int statusCode, String message, OutputStream out) throws IOException {
    String response = "HTTP/1.1 " + statusCode + " " + message + "\r\n\r\n";
    out.write(response.getBytes());
}
}
