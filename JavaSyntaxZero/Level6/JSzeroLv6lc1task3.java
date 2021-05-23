package JavaSyntaxZero.Level6;

import java.util.Arrays;

/*
Работаем с элементами массива
*/

public class JSzeroLv6lc1task3 {
    public static int[] array = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                array[i] *= (-1);
        System.out.println(Arrays.toString(array));
    }
}
