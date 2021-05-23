package JavaSyntaxZero.Level17;

/*
День недели рождения твоего
*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JSzeroLv17lc3task1 {

    static Calendar birthDate = new GregorianCalendar(1992, 5, 10);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String result = "";
        switch (dayOfWeek) {
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 7:
                result = "Воскресенье";
                break;

        }
        return result;
    }
}
