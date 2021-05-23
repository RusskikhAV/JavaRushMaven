package JavaSyntaxZero.Level11;

import java.util.Calendar;

public class JSzeroLv11lc6task8 {

    private int currentYear;


    JSzeroLv11lc6task8() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public static void main(String[] args) {
        JSzeroLv11lc6task8 solution = new JSzeroLv11lc6task8();
        System.out.println(solution.getCurrentYear());
    }
}
