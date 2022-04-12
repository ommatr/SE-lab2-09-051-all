import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost",4004);
        OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
        BufferedReader reader= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedReader newReader = new BufferedReader(new InputStreamReader(System.in));

        String message =reader.readLine();
        System.out.println(message);
        String arr = newReader.readLine();
        writer.write(arr + "\n");
        writer.flush();
        String newMessage=reader.readLine();
        System.out.println(newMessage);

        writer.close();
        reader.close();
        clientSocket.close();
    }
}