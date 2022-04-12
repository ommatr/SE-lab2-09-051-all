import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4004);
        System.out.println("Сервер done!");
        while (true) {
            Socket clientSocket = serverSocket.accept();
            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            writer.write("Введите вариант и x,y\n");
            writer.flush();

            String arr = reader.readLine();
            String[] arrs = arr.split(" ");
            Double result = 0.0;
            if (arrs[0].equals("v15") || arrs[0].equals("V15")) {
                result = V15.compute(Double.valueOf(arrs[1]), Double.valueOf(arrs[2]));
                System.out.println("Получено: Вариант = " + arrs[0] + "\n" + "x = " + arrs[1] + "\n" + "y = " + arrs[2] + "\n");
                System.out.println("Рассчитано: Результат = " + result);
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