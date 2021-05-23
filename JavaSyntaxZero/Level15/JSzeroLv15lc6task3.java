package JavaSyntaxZero.Level15;


import java.util.ArrayList;
import java.util.List;

/*
Стек в домашних условиях
*/

public class JSzeroLv15lc6task3 {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
        var a = storage.get(0);
        storage.remove(0);
        return a;
    }

    public String peek() {
        return storage.get(0);
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public int search(String s) {
        return storage.indexOf(s);
    }
}
