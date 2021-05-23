package JavaSyntaxZero.Level14.Month;

public enum Month1 {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month1[] getWinterMonth() {
        Month1[] winterMonth = new Month1[]{DECEMBER, JANUARY, FEBRUARY};
        return winterMonth;
    }

    public static Month1[] getSpringMonth() {
        Month1[] springMonth = new Month1[]{MARCH, APRIL, MAY};
        return springMonth;
    }

    public static Month1[] getSummerMonth() {
        Month1[] summerMonth = new Month1[]{JUNE, JULY, AUGUST};
        return summerMonth;
    }

    public static Month1[] getAutumnMonth() {
        Month1[] autumnMonth = new Month1[]{SEPTEMBER, OCTOBER, NOVEMBER};
        return autumnMonth;
    }


}

