package JavaSyntaxZero.Level6;

import java.util.Arrays;
import java.util.Scanner;

/*
Минимальное из N чисел
*/

public class JSzeroLv6lc3task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0]);
    }
}
