package JavaSyntaxZero.Level17;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
Еще один простой шаблон
*/

public class JSzeroLv17lc8task2 {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        String text = dtf.format(zonedDateTime);
        System.out.println(text);
    }
}
