package JavaSyntaxZero.Level17;

import java.time.Instant;

/*
Конец времен
*/

public class JSzeroLv17lc6task3 {

    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        var a = Instant.MAX;
        Instant mili = Instant.ofEpochMilli(Long.MAX_VALUE);

        return mili;
    }

    static Instant getMaxFromSeconds() {
        var a = Instant.MAX;
        Instant second = Instant.ofEpochSecond(a.getEpochSecond());

        return second;
    }

    static Instant getMaxFromSecondsAndNanos() {
        var a = Instant.MAX;
        Instant secondAndNano = Instant.ofEpochSecond(a.getEpochSecond(), a.getNano());

        return secondAndNano;
    }
}
