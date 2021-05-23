package JavaSyntaxZero.Level6;

import java.util.Arrays;

/*
 Делим массив
*/

public class JSzeroLv6lc8task4 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 10;

    public static void main(String[] args) {
        int[] c = Arrays.copyOf(array, array.length);
        Arrays.sort(c);
        int result = Arrays.binarySearch((c), element);
        System.out.println(result >= 0);
    }
}
