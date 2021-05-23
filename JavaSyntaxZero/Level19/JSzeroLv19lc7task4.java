package JavaSyntaxZero.Level19;

import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
Из потока данных — в map
*/
public class JSzeroLv19lc7task4 {

    public static void main(String[] args) {
        var stringStream = Stream.of("To", "be", "a", "programmer", "you", "need", "to", "code");

        System.out.println(getString(stringStream));
    }

    public static String getString(Stream<String> stringStream) {

        return stringStream.collect(Collectors.joining(" "));
    }
}
