package JavaSyntaxZero.Level8;

import java.util.Arrays;

/*
Гибкое заполнение массива
 */
public class JSzeroLv8lc3task2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        for (int i = 0; i < array.length; i++) {
            if (i >= begin && i < end) {
                array[i] = value;
            }
        }
    }
}
