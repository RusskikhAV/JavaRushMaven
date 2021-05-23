package JavaSyntaxZero.Level19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Как быть, если в списке есть элемент null
*/

public class JSzeroLv19lc6task3 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";


    }
}
