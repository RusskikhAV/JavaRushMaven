package JavaSyntaxZero.Level14;

import java.util.*;

public class JSzeroLv14lc2task2 {
    public static void printList(ArrayList<String> words) {
 /*       for (Iterator<String> iterator = words.iterator(); iterator.hasNext(); ) {
            String word = iterator.next();
            System.out.println(word);
        }*/
        //Iterator<String> iterator = words.iterator();
        for (String a : words) {
            System.out.println(a);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        for (String a : words) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
