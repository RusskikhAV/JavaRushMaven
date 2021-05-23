package JavaSyntaxZero.Level16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Пишем байты в файл
*/
public class JSzeroLv16lc4task1 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = args[0].getBytes();
        //Scanner scanner = new Scanner(System.in);
        //String file = scanner.nextLine();
        try (Scanner scanner = new Scanner(System.in)) {
            String file = scanner.nextLine();
            Path path = Path.of(file);
            Files.write(path, bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
