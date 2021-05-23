package JavaSyntaxZero.Level16;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/*
Получение информации по API
*/

public class JSzeroLv16lc7task3 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        connection.connect();
        try (OutputStream output = connection.getOutputStream()) {
            output.write(1);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String answer = bufferedReader.readLine();
            System.out.println(answer);
        }
    }
}
