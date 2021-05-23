package JavaSyntaxZero.Level13;

public class JSzeroLv13lc2task2 {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
        System.out.println(divide(Double.POSITIVE_INFINITY, -3));
    }

    public static double divide(double a, double b) {
        if (a > 0 && b == 0) {
            System.out.println(Double.POSITIVE_INFINITY);
        } else if (a == Double.POSITIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY) {
            System.out.println(Double.POSITIVE_INFINITY);
        } else if (a == Double.NEGATIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY) {
            System.out.println(Double.POSITIVE_INFINITY);
        } else if (a < 0 && b == 0) {
            System.out.println(Double.NEGATIVE_INFINITY);
        } else if (a == Double.NEGATIVE_INFINITY && b >= 0 && b != Double.POSITIVE_INFINITY) {
            System.out.println(Double.NEGATIVE_INFINITY);
        } else if (a == Double.POSITIVE_INFINITY && b < 0 && b != Double.NEGATIVE_INFINITY) {
            System.out.println(Double.NEGATIVE_INFINITY);
        } else if (a == 0 && b == 0) {
            System.out.println(Double.NaN);
        } else if (a == Double.NaN || b == Double.NaN) {
            System.out.println(Double.NaN);
        } else if (a == Double.POSITIVE_INFINITY && b == Double.POSITIVE_INFINITY) {
            System.out.println(Double.NaN);
        } else if (a == Double.POSITIVE_INFINITY && b == Double.NEGATIVE_INFINITY) {
            System.out.println(Double.NaN);
        } else if (a == Double.NEGATIVE_INFINITY && b == Double.POSITIVE_INFINITY) {
            System.out.println(Double.NaN);
        } else if (a == Double.NEGATIVE_INFINITY && b == Double.NEGATIVE_INFINITY) {
            System.out.println(Double.NaN);
        }
        return a / b;
    }
}
