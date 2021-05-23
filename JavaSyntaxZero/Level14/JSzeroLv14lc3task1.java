package JavaSyntaxZero.Level14;

import java.util.ArrayList;
import java.util.Collections;

/*public class JSzeroLv14lc2task1 {
    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if(destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
        for (int i = 0; i < source.size(); i++) {
            destination.set(i, source.get(i));
        }
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        for (String string : strings) {
            list.add(string);
        }
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if(string.equals(oldValue)) {
                list.set(i, newValue);
            }
        }
    }
}*/
public class JSzeroLv14lc3task1 {
    public static void copy(ArrayList<String> destination, ArrayList<String> source) {
        if (destination.size() < source.size()) {
            throw new IndexOutOfBoundsException("Source does not fit in dest");
        }
        Collections.copy(destination, source);
    }

    public static void addAll(ArrayList<String> list, String... strings) {
        Collections.addAll(list, strings);
    }

    public static void replaceAll(ArrayList<String> list, String oldValue, String newValue) {
        Collections.replaceAll(list, oldValue, newValue);
    }
}
