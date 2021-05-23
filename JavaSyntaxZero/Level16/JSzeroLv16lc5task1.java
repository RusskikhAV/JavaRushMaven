package JavaSyntaxZero.Level16;

import java.nio.file.Path;
import java.util.Scanner;

public class JSzeroLv16lc5task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Path path = Path.of(str).getRoot();
        System.out.println(path);
    }
}
