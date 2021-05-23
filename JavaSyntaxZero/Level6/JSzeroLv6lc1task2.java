package JavaSyntaxZero.Level6;

/*
Четные и нечетные ячейки массива
*/

public class JSzeroLv6lc1task2 {
    public static final String ODD = "Нечётный";
    public static final String EVEN = "Чётный";
    public static String[] string = new String[20];

    public static void main(String[] args) {
        for (int i = 0; i < string.length; i++) {
            if (i % 2 == 0)
                string[i] = EVEN;
            else
                string[i] = ODD;
            System.out.print("index = " + i);
            System.out.println(" value = " + string[i]);

        }
    }
}
