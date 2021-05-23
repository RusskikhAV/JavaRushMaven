package JavaSyntaxZero.Level16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Пропускаем не всех
*/
public class JSzeroLv16lc3task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            var lines = Files.readAllLines(Path.of(scanner.nextLine()));
            for (int i = 0; i < lines.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(lines.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
