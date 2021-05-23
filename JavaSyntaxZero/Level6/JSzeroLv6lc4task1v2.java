package JavaSyntaxZero.Level6;

import java.util.Arrays;
import java.util.Scanner;


public class JSzeroLv6lc4task1v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int j = 0; j < strings.length - 1; j++) {
            int m = 0;
            for (int k = 0; k < strings.length; k++) {
                if (j == k) {
                    continue;
                } else if ((strings[j] == null) || (strings[k] == null)) {
                    continue;
                } else if (strings[j].equals(strings[k])) {
                    strings[k] = null;
                    m++;
                }
            }

            if (m > 0) {
                strings[j] = null;
            }
        }
        //System.out.println(Arrays.toString(strings) + " 1");
        Arrays.stream(strings).forEach(System.out::println);
    }
}

