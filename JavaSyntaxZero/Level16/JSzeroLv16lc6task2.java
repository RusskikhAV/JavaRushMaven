package JavaSyntaxZero.Level16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Файловые операции
*/

public class JSzeroLv16lc6task2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        if (Files.notExists(filePath)) {
            Files.createFile(filePath);
        }
        if (Files.exists(filePath)) {
            if (Files.notExists(fileNewPath)) {
                Files.move(filePath, fileNewPath);
            } else Files.delete(filePath);
        }
    }
}
