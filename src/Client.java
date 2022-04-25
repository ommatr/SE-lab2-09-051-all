package src;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("localhost",4004);
        OutputStreamWriter out = new OutputStreamWriter(clientSocket.getOutputStream());
        BufferedReader reader= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String message =reader.readLine();
        System.out.println(message);
        String arr = in.readLine();
        out.write(arr + "\n");
        out.flush();
        String newMessage=reader.readLine();
        System.out.println(newMessage);

        out.close();
        reader.close();
        clientSocket.close();
    }
}