package JavaSyntaxZero.Level17;


import java.time.LocalDate;

/*
Освоение нового API
*/

public class JSzeroLv17lc4task1 {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        LocalDate ld = LocalDate.now();

        return ld;
    }

    static LocalDate ofExample() {
        LocalDate ldof = LocalDate.of(2020, 9, 12);

        return ldof;
    }

    static LocalDate ofYearDayExample() {
        LocalDate ldofyd = LocalDate.ofYearDay(2020, 256);

        return ldofyd;
    }

    static LocalDate ofEpochDayExample() {
        LocalDate lDofED = LocalDate.ofEpochDay(18517);

        return lDofED;
    }
}
