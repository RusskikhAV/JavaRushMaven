package JavaSyntaxZero.Level14;

import java.util.ArrayList;
import java.util.Iterator;

/*
Найти и обезвредить
*/
public class JSzeroLv14lc2task3 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.equals("bug") || str.equals("Bug")) {
                list.remove(str);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //ArrayList<String> listCopy = new ArrayList(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("bug") || str.equals("Bug"))
                iterator.remove();
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<>(list);
        for (String str : listCopy) {
            if (str.equals("bug") || str.equals("Bug"))
                list.remove(str);
        }
    }
}

