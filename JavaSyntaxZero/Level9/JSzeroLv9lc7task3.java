package JavaSyntaxZero.Level9;

public class JSzeroLv9lc7task3 {

    public static void main(String[] args) {
        int a = 3;
        //int b = ++a + (a++ * --a);
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}
