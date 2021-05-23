package JavaSyntaxZero.Level6;

import java.util.Arrays;
import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class JSzeroLv6lc4task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int j = 0; j < strings.length - 1; j++) {
            for (int k = j + 1; k < strings.length; k++) {
                if ((strings[j] != null) && (strings[k] != null)) {
                    if (strings[j].equals(strings[k]) && j != k) {
                        //strings[j] = null;
                        strings[k] = null;
                    }
                }
            }
            //System.out.println(Arrays.toString(strings) + " 1");
        }
        System.out.println(Arrays.toString(strings));
    }
}

