package JavaSyntaxZero.Level7;
/*
У всего есть корень
*/

public class JSzeroLv7lc5task1 {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "Корень квадратный для числа ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elemntSqrt = Math.sqrt(element);
            System.out.println(elementSqrt + element + " равен " + elemntSqrt);
        }
    }
}
