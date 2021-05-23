package JavaSyntaxZero.Level16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Пишем символы в файл
*/
public class JSzeroLv16lc4task2 {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);
        String file = scanner.nextLine();
        Path path = Path.of(file);
        try (var writer = Files.newBufferedWriter(path)) {
            for (char a : chars) {
                writer.write(a);
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
