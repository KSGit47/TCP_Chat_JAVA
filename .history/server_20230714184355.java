import java.net.*;
public class Server {
    ServerSocket server;
    Socket socket;
    public Server(){
        try {
            server = new ServerSocket(7777);
            System.out.println();;
        
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        new Server();
    }
}