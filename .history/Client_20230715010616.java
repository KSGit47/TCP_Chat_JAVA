import java.net.*;
import java.io.*;
public class Client {
    ServerSocket server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;
    public static void main(String [] args){
        System.out.println("hello  ji");
        Socket socket;
        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
            startReading();
            startWritng();

    }
}
