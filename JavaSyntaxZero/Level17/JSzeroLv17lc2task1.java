package JavaSyntaxZero.Level17;

import java.util.Date;

/*
Лишь бы не в понедельник:)
*/
public class JSzeroLv17lc2task1 {

    static Date birthDate = new Date(92, 5, 10);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int day = date.getDay();
        String result;
        switch (day) {
            case 0:
                result = "Понедельник";
                break;
            case 1:
                result = "Вторник";
                break;
            case 2:
                result = "Среда";
                break;
            case 3:
                result = "Четверг";
                break;
            case 4:
                result = "Пятница";
                break;
            case 5:
                result = "Суббота";
                break;
            case 6:
                result = "Воскресенье";
                break;
            default:
                result = "";
                break;
        }

        return result;
    }
}

