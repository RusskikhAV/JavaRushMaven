package JavaSyntaxZero.Level7;

/*
Кубический калькулятор в кубе
*/
public class JSzeroLv7lc3task3 {
    public static void main(String[] args) {

    }

    public static long cube(long a) {
        a = a * a * a;
        return a;
    }

    public static long ninthDegree(long a) {
        long b, c;
        b = cube(a);
        c = cube(b);
        return c;
    }
}
