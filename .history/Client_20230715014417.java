import java.net.*;
import java.io.*;
public class Client {
  
    Socket socket;
    BufferedReader br;
    PrintWriter out;

    public Client(){
         System.out.println("Client constructor runnning..\n");
         try {
            System.out.println("Sending request...");
            socket = new Socket("127.0.0.1", 7777);
            System.out.println("connection done");
             br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());
            startReading();
            startWritng();
         } catch (Exception e) {
            // TODO: handle exception
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
                    System.out.println("Server terminated the chat.");
                    break;
                   }
                   else{
                    System.out.println("Server: "+msg);
                   }
              } catch (Exception e) {
                // TODO: handle exception
              }}
        };
        new Thread(r1).start();
    }
    public void startWritng(){
        Runnable r2 = ()->{
              System.out.println("Writer Started");
              while(true){try {
                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
                String content = br1.readLine();
                out.println(content);
                out.flush();
              } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
              }}
        };
        new Thread(r2).start();
    }
    public static void main(String [] args){
        System.out.println("Client running ");
        new Client();
    }
}
