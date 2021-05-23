package JavaSyntaxZero.Level17.Convert;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/*
Синтезируем LocalDateTime
*/
public class Solution {
    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = JSzeroLv17lc6task1.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> set = new HashSet<>();
        for (Map.Entry<LocalDate, List<LocalTime>> entry : sourceMap.entrySet()) {
            for (var a : entry.getValue()) {
                LocalDateTime ldt = LocalDateTime.of(entry.getKey(), a);
                set.add(ldt);

            }
        }
        return set;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
