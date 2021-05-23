package JavaSyntaxZero.Level19;


import java.util.ArrayList;
import java.util.Collections;

/*
Прощание с foreach
*/

public class JSzeroLv19lc2task2 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
