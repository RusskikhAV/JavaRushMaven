package JavaSyntaxZero.Level8;

/*
Бесконечность не предел
*/

public class JSzeroLv8lc1task5 {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 1.0;
        double c = -1;
        div(a, b);
        div(a, c);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
