package JavaSyntaxZero.Level17;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Напиши шаблон
*/

public class JSzeroLv17lc8task3 {

    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
    static String timeString = "13:30:45 23/02/2019";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.parse(timeString, dateTimeFormatter);

        System.out.println(dateTime);
    }
}
