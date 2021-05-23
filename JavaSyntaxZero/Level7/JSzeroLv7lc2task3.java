package JavaSyntaxZero.Level7;

import java.util.Arrays;

/*
Правильный порядок
*/
public class JSzeroLv7lc2task3 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        int[] ars = Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = ars[(array.length - 1) - i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
