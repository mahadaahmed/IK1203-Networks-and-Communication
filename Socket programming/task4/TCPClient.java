
import java.io.*;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class TCPClient {
    private boolean shutdown;
    private Integer timeout;
    private Integer limit;

    public TCPClient() {
    }

    public TCPClient(boolean shutdown, Integer timeout, Integer limit) {
        this.shutdown = shutdown;
        this.timeout = timeout;
        this.limit = limit;
    }

    public byte[] askServer(String hostName, int port, byte[] bytesToServer) throws IOException {
        Socket socket = connectToServer(hostName, port);
        sendDataToServer(socket, bytesToServer);

        byte[] dataFromServer = receiveDataFromServer(socket);
        socket.close();

        return dataFromServer;
    }

    private Socket connectToServer(String hostName, int port) throws IOException {
        Socket socket = null;

        try {
            socket = new Socket(hostName, port);
            if (timeout != null) {
                socket.setSoTimeout(timeout);
            }
        } catch (Exception error) {
            throw new IOException("Cannot connect to server");
        }
        return socket;
    }

    private void sendDataToServer(Socket socket, byte[] bytesToServer) throws IOException {
        OutputStream output = socket.getOutputStream();
        output.write(bytesToServer);
        if (shutdown) {
            socket.shutdownOutput();
        }
    }

    private byte[] receiveDataFromServer(Socket socket) throws IOException {
        InputStream input = socket.getInputStream();
        int dataServerLength = 0;
        byte[] data = new byte[1024];
        ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
        long startTime = System.currentTimeMillis();

        for (;;) {
            if (limit != null && dataServerLength >= limit) {
                break;
            }

            if (timeout != null && System.currentTimeMillis() - startTime > timeout) {
                break;
            }

            try {
                dataServerLength = input.read(data);
                if (dataServerLength == -1) {
                    break;
                }
                outputBuffer.write(data, 0, dataServerLength);
            } catch (SocketTimeoutException ex) {
                break;
            }
        }

        return outputBuffer.toByteArray();
    }

    public byte[] askServer(String hostName, int port) throws IOException {
        return askServer(hostName, port, new byte[0]);
    }
}