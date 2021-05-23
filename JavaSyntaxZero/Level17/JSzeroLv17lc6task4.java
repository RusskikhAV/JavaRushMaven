package JavaSyntaxZero.Level17;


import java.time.Instant;

/*
Ой как много методов!
*/

public class JSzeroLv17lc6task4 {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        Instant plusMin = instant.plusSeconds(minutes * 60);

        return plusMin;
    }

    static public Instant plusHours(Instant instant, long hours) {
        Instant plusHour = instant.plusSeconds(hours * 60 * 60);

        return plusHour;
    }

    static public Instant plusDays(Instant instant, long days) {
        Instant plusDay = instant.plusSeconds(days * 24 * 60 * 60);

        return plusDay;
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        Instant minusMin = instant.minusSeconds(minutes * 60);

        return minusMin;
    }

    static public Instant minusHours(Instant instant, long hours) {
        Instant minusHour = instant.minusSeconds(hours * 60 * 60);

        return minusHour;
    }

    static public Instant minusDays(Instant instant, long days) {
        Instant minusDay = instant.minusSeconds(days * 24 * 60 * 60);

        return minusDay;
    }
}
