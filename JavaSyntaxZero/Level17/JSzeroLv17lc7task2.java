package JavaSyntaxZero.Level17;

import java.time.*;

/*
Временная глобализация
*/

public class JSzeroLv17lc7task2 {

    static LocalDateTime localDateTime = LocalDateTime.of(2020, 3, 19, 9, 17);
    static ZoneId zoneId = ZoneId.of("Zulu");
    static ZonedDateTime globalTime;

    public static void main(String[] args) {
        globalTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(globalTime);
    }
}
