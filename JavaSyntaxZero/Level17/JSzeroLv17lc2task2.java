package JavaSyntaxZero.Level17;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Подчищаем хвосты
*/

public class JSzeroLv17lc2task2 {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015, 12, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));
        dateList.add(new Date(1899, 11, 25, 20, 40));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        Date date = new Date();
        for (var dates : brokenDates) {
            if (date.before(dates)) {
                dates.setYear(dates.getYear() - 1900);
                dates.setMonth(dates.getMonth() - 1);
            }
        }
    }
}
