package JavaSyntaxZero.Level14.GetNextMonth;

import JavaSyntaxZero.Level14.Month.Month1;

public class GetNextMonth {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month1.JANUARY));
        System.out.println(getNextMonth(Month1.JULY));
        System.out.println(getNextMonth(Month1.DECEMBER));
    }

    public static Month1 getNextMonth(Month1 month) {
        int index = month.ordinal();
        if (index == 11) {
            return Month1.values()[0];
        }

        return Month1.values()[index + 1];

    }
}
