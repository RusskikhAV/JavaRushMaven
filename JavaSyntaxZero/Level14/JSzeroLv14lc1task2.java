package JavaSyntaxZero.Level14;

import java.util.HashSet;

import static java.util.Arrays.asList;


public class JSzeroLv14lc1task2 {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word) {
        boolean isTrue = words.contains(word);
        if (isTrue) {
            System.out.println("Слово " + word + " есть в множестве");
        } else
            System.out.println("Слова " + word + " нет в множестве");
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }
}
