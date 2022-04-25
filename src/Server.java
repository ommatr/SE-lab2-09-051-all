package src;

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

            writer.write("Введите вариант, угол , первую и вторую переменные\n");
            writer.flush();

            String arr = reader.readLine();
            String[] arrs=arr.split(" ");
            Double result=0.0;
            if (arrs[0].equals("v9") || arrs[0].equals("V9")) {
                result = V9.urav(Double.valueOf(arrs[1]), Double.valueOf(arrs[2]), Double.valueOf(arrs[3]));
                System.out.println("Вариант = "+arrs[0] + "\n" + "alpha = "+arrs[1] + "\n" + "a = "+arrs[2]+ "\n" +"b = "+arrs[3] + "\n");
                System.out.println("Рассчитано: Результат = "+result);
                writer.write("Result = " + result + "\n");
                writer.flush();
            } else {
                System.out.println("Смените вариант");
                System.out.println("Ошибка принудительный аборт");
            }
            reader.close();
            writer.close();
            clientSocket.close();
        }
    }
}