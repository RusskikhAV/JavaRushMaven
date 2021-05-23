package JavaSyntaxZero.Level6;

import java.util.Arrays;

public class JSzeroLv6lc2task1sort {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (i % 2 == 0) {
                resultArray[i] = secondArray[j];
                j++;
            } else {
                resultArray[i] = firstArray[k];
                k++;
            }
        }
        Arrays.sort(resultArray);
        Arrays.sort(resultArray);

        System.out.println(Arrays.toString(resultArray));
    }
}
