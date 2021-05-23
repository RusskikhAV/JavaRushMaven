package JavaSyntaxZero.Level17;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/*
Лишь бы не запутаться
*/

public class JSzeroLv17lc7task3 {

    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Zulu");
        ZoneId zone2 = ZoneId.of("Etc/GMT+8");

        System.out.println(ZonedDateTime.now(zone1));
        System.out.println(ZonedDateTime.now(zone2));

        LocalDateTime time = changeZone(LocalDateTime.of(2020, 3, 19, 1, 40), zone1, zone2);
        System.out.println(time);
    }

    static LocalDateTime changeZone(LocalDateTime fromDateTime, ZoneId fromZone, ZoneId toZone) {
        ZonedDateTime time1 = ZonedDateTime.of(fromDateTime, fromZone);
        TimeZone tz1 = TimeZone.getTimeZone(toZone);
        TimeZone tz2 = TimeZone.getTimeZone(fromZone);
        long timeDifference = tz1.getRawOffset() - tz2.getRawOffset() + tz1.getDSTSavings() - tz2.getDSTSavings();

        LocalDateTime a = time1.toLocalDateTime().plusSeconds(timeDifference / 1000);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.n");
        a.format(dateTimeFormatter);

        return a;
    }
}
