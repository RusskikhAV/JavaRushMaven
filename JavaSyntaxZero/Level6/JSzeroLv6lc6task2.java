package JavaSyntaxZero.Level6;

/*
Создаем двухмерный массив
*/

import java.util.Scanner;

public class JSzeroLv6lc6task2 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        multiArray = new int[n][];
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                multiArray[i] = new int[a];
            }
        }
    }
}
