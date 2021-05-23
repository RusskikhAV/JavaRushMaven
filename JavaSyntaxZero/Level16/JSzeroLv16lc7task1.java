package JavaSyntaxZero.Level16;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Временное сохранение файла
*/
public class JSzeroLv16lc7task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        try (InputStream input = url.openStream()) {
            byte[] buffer = input.readAllBytes();
            Path tem = Files.createTempFile(null, null);
            Files.write(tem, buffer);
        }
    }
}
