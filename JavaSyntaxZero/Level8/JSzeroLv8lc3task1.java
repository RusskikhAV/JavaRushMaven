package JavaSyntaxZero.Level8;

import java.util.Arrays;

/*
Массив значений
 */
public class JSzeroLv8lc3task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
