package JavaSyntaxZero.Level17;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/*
Просто день недели
*/

public class JSzeroLv17lc4task3 {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        String a = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));

        return a;
    }
}
