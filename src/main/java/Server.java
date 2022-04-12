import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4004);
        System.out.println("Сервер запущен!");
        while (true) {
            Socket clientSocket = serverSocket.accept();
            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
            BufferedReader reader= new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            writer.write("Введите вариант и число x\n");
            writer.flush();

            String arr = reader.readLine();
            String[] arrs=arr.split(" ");
            Double result=0.0;
            if (arrs[0].equals("v13")||arrs[0].equals("V13")) {
                result = V13.eq(Double.valueOf(arrs[1]));
                System.out.println("Получено: Вариант = "+arrs[0] + "\n" + "alpha = "+arrs[1]);
                System.out.println("Рассчитано: Результат = "+result);
                writer.write("Result = " + result + "\n");
                writer.flush();
            }
            reader.close();
            writer.close();
            clientSocket.close();
        }
    }
}