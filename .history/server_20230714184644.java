import java.net.*;
import java.io.*abstract;
public class Server {
    ServerSocket server;
    Socket socket;
    public Server(){
        try {

            server = new ServerSocket(7777);
            System.out.println("server is ready to begin");
            System.out.println("waiting");
            socket =  server.accept();
        
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        new Server();
    }
}