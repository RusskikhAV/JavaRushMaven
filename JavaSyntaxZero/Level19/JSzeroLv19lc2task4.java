package JavaSyntaxZero.Level19;

import java.util.ArrayList;
import java.util.Collections;

/*
Прощание со ссылками на методы
*/

public class JSzeroLv19lc2task4 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 12, 34, 54, 32, 1, 453, 1111);

        print(numbers);
    }

    public static void print(ArrayList<Integer> numbers) {
        numbers.forEach(number -> System.out.println(number));
    }
}

