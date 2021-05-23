package JavaSyntaxZero.Level8;

/*
Странное деление
*/
public class JSzeroLv8lc1task6 {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 1.0;
        double c = -1;
        double d = a / b;
        double e = a / c;
        div(d, e);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}