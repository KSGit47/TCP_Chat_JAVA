import java.net.*;
import java.io.*;
class Server {
    ServerSocket server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;
    public Server(){
        try {
            server = new ServerSocket(7777);
            System.out.println("server is ready to begin");
            System.out.println("waiting");
            socket =  server.accept();
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
            s
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        new Server();
    }
}