package JavaSyntaxZero.Level16;

import java.util.Scanner;

/*
Возврат к истокам
*/
public class JSzeroLv16lc1task2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());


        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            scanner.close();
        }
    }
}
