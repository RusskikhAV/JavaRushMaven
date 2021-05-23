package JavaSyntaxZero.Level16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Файл или директория
*/
public class JSzeroLv16lc6task1 {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
/*        try (Scanner scanner = new Scanner(System.in)){
            int a = 0;
            if (scanner.hasNextLine()) {
                a++;
            }
            String[] files = new String[a];
            for (int i = 0; i < files.length; i++) {
                if (Files.isRegularFile(Path.of(files[i]))) {
                    System.out.println(files[i] + THIS_IS_FILE);
                } else if (Files.isDirectory(Path.of(files[i]))) {
                    System.out.println(files[i] + THIS_IS_DIR);
                }
            }

        }*/
        Scanner scanner = new Scanner(System.in);
        String a;
        try {
            while (true) {
                a = scanner.nextLine();
                if (Files.isRegularFile(Path.of(a))) {
                    System.out.println(a + THIS_IS_FILE);
                } else if (Files.isDirectory(Path.of(a))) {
                    System.out.println(a + THIS_IS_DIR);
                } else break;
            }
        } catch (Exception e) {

        } finally {
            scanner.close();
        }
    }
}
