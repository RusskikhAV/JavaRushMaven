package JavaSyntaxZero.Level6;

import java.util.Arrays;

/*
 Делим массив
*/

public class JSzeroLv6lc8task2 {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        if (array.length % 2 == 0) {
            int[] arr2;
            int[] arr1 = Arrays.copyOfRange(array, 0, (array.length / 2));
            arr2 = Arrays.copyOfRange(array, (array.length / 2), array.length);
            result[0] = arr1;
            result[1] = arr2;
        } else {
            int[] arr2;
            int[] arr1 = Arrays.copyOfRange(array, 0, (array.length / 2) + 1);
            arr2 = Arrays.copyOfRange(array, (array.length / 2) + 1, array.length);
            result[0] = arr1;
            result[1] = arr2;
        }
        System.out.println(Arrays.deepToString(result));
    }
}
