package JavaSyntaxZero.Level16;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/*
Задом наперед it's a text for testing
*/
public class JSzeroLv16lc4task3 {
    /*    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        public static PrintStream stream = new PrintStream(outputStream);

        public static void main(String[] args) throws IOException {

            Scanner scanner = new Scanner(System.in);
            printSomething(scanner.nextLine());
            String result = outputStream.toString();
            outputStream.reset();
            char[] a = result.toCharArray();
            char[] b = new char[result.length()];
            int n = result.length() - 1;
            for(int i = 0; i < result.length(); i++){
                b[n] = a[i];
                n--;
            }
            String c = String.valueOf(b);
            printSomething(c);
            System.out.println(outputStream);
            long time = System.nanoTime();
            time = System.nanoTime() - time;
                  System.out.printf("Elapsed %,9.3f ms\n", time/1.0);
        }

        public static void printSomething(String str) {
            stream.print(str);
        }
    }*/
    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);

    public static void main(String[] args) throws IOException {
        long time = System.nanoTime();
        time = System.nanoTime() - time;
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        String result = outputStream.toString();
        outputStream.reset();
        StringBuffer sb = new StringBuffer(result);
        sb.reverse();
        String c = String.valueOf(sb);
        printSomething(c);
        System.out.println(outputStream);

        System.out.printf("Elapsed %,9.3f ms\n", time / 1.0);
    }

    public static void printSomething(String str) {
        stream.print(str);
    }
}
