package JavaSyntaxZero.Level16;

import java.nio.file.Path;
import java.util.Scanner;

public class JSzeroLv16lc5task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean abs = Path.of(str).isAbsolute();
        if (!abs) {
            System.out.println(Path.of(str).toAbsolutePath());
        } else System.out.println(str);
    }
}