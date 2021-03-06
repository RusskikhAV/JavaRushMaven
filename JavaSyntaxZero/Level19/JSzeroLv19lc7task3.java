package JavaSyntaxZero.Level19;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/*
Из потока данных — в map
*/
public class JSzeroLv19lc7task3 {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {

        return stringStream.collect(toMap(e -> e, String::length));
    }
}

