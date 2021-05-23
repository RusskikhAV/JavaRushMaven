package JavaSyntaxZero.Level17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Простой шаблон
*/

public class JSzeroLv17lc8task1 {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy" + "г.H" + "ч.m" + "мин");
        String text = dtf.format(localDateTime);
        System.out.println(text);
    }
}
