package JavaSyntaxZero.Level6;

import java.util.Scanner;

/*
Reverse
*/

public class JSzeroLv6lc3task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        if (n % 2 == 0) {
            for (int k = array.length - 1; k >= 0; k--)
                System.out.println(array[k] + " for");
        } else {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j] + " else");
            }
        }
    }
}
