package JavaSyntaxZero.Level13;

public class JSzeroLv13lc2task4 {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;

        Boolean isLess = isLess(first, second);

        if (isLess) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Первое число больше или равно второму числу");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second;
    }
}


