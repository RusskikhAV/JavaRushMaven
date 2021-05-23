package JavaSyntaxZero.Level9;

/*
Утильный класс: часть 2
*/
public class JSzeroLv9lc1task2 {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(int number, int power) {
  /*      int result = number;
        if(power == 0) {
            return 1;
        }
        for(int i = 1; i < power; i++) {
            result *= number;
        }*/
        return Math.pow(number, power);
    }
}

