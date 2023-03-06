package tcpclient;

import java.net.*;
import java.io.*;

public class TCPClient {

    public TCPClient() {
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
        } catch (Exception error) {
            throw new IOException("Cannot connect to server");
        }
        return socket;
    }

    private void sendDataToServer(Socket socket, byte[] bytesToServer) throws IOException {
        OutputStream output = socket.getOutputStream();
        output.write(bytesToServer);
    }

    private byte[] receiveDataFromServer(Socket socket) throws IOException {
        InputStream input = socket.getInputStream();
        int dataServerLength;
        byte[] data = new byte[1024];
        ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();

        for (;;) {

            dataServerLength = input.read(data);
            if (dataServerLength == -1) {
                break;
            }

            outputBuffer.write(data, 0, dataServerLength);
        }
        return outputBuffer.toByteArray();
    }

    public byte[] askServer(String hostName, int port) throws IOException {
        byte [] bytes = new byte[0];
        return askServer(hostName, port, bytes);
    }

}
