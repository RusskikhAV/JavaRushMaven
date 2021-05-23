package JavaSyntaxZero.Level19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/*
Без повторов
*/

public class JSzeroLv19lc4task3 {

    public static void main(String[] args) {
        var words = new ArrayList<String>();
        Collections.addAll(words, "чтобы", "стать", "программистом", "нужно", "программировать",
                "а", "чтобы", "программировать", "нужно", "учиться");

        Stream<String> distinctWords = getDistinctWords(words);
        distinctWords.forEach(System.out::println);
    }

    public static Stream<String> getDistinctWords(ArrayList<String> words) {
        Stream<String> stream = words.stream().distinct();
        return stream;
    }
}