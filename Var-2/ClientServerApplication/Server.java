
import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Arrays;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = null;
        String line;
        BufferedReader in;
        BufferedWriter out;
        Socket socketOfServer = null;
        try {
            server = new ServerSocket(4004);
            System.out.println("Server starts to operate.Waiting for clients.");
            socketOfServer = server.accept();

        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }
        try {
            in = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));
            String s = in.readLine();
            System.out.println(s);
            Scanner scanner = new Scanner(s);
            String variant = scanner.next();
            double arg1 = scanner.nextDouble();
            double arg2 = scanner.nextDouble();
            double arg3 = scanner.nextDouble();
            double arg4 = scanner.nextDouble();
            double[] arguments = new double[]{arg1, arg2, arg3, arg4};
            out.write("Var = " + variant + ", arguments: " + Arrays.toString(arguments));
            out.newLine();
            out.write("Result = " + String.valueOf(V2.compute(arg1, arg2, arg3, arg4)));
            out.newLine();
            out.flush();
            socketOfServer.close();
            in.close();
            out.close();
            server.close();
        } catch (IOException e) {
            System.out.println();

        }
    }
}
