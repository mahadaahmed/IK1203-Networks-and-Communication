
import java.net.*;
import java.io.*;

public class ConcHTTPAsk {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java ConcHTTPAsk <port>");
            System.exit(1);
        }
        try{
            int port = Integer.parseInt(args[0]);
            ServerSocket socket = new ServerSocket(port);
            for(;;){
                Socket connectionSocket = socket.accept();
                MyRunnable run = new MyRunnable(connectionSocket);
                new Thread(run).start();
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}