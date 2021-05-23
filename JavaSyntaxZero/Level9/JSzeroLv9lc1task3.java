package JavaSyntaxZero.Level9;

import java.util.Scanner;

public class JSzeroLv9lc1task3 {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        return Math.min(ints[0], Math.min(ints[1], Math.min(ints[2], Math.min(ints[3], Math.min(ints[4], Math.min(ints[5], Math.min(ints[6], Math.min(ints[7], Math.min(ints[8], (ints[9]))))))))));
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;

    }
}
