package JavaSyntaxZero.Level9;

/*
 побитовые операции
 */
public class JSzeroLv9lc5task2 {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int x1 = x & y;
        int x2 = x ^ y;
        x = x1 | y;
        //int y1 = x1 ^ y;
        y = y ^ x2;

        System.out.println(x);
        System.out.println(y);
        // System.out.println(x1);
        //  System.out.println(y1);
    }
}

