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
            startReading();
            startWritng();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void startReading(){
        Runnable r1 = ()->{
            System.out.println("Reader started.. ");
            while(true)
             { try {
                   String msg = br.readLine();
                   if(msg=="") {
                    System.out.println("Client terminated the chat.");
                    break;
                   }
                   else{
                    System.out.println("Client: "+msg);
                   }
              } catch (Exception e) {
                // TODO: handle exception
              }}
        };
    }
    public void startWritng(){
        Runnable r2 = ()->{
              System.out.println("Writer Started");
              while(true){try {
                BufferedReader br1 = new BufferedReader(new InputStreamReader(, null)));
              } catch (Exception e) {
                // TODO: handle exception
              }}
        };
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        new Server();
    }
}