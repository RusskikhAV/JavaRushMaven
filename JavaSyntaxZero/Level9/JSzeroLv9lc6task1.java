package JavaSyntaxZero.Level9;

public class JSzeroLv9lc6task1 {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(6));
    }

    public static int getPowerOfTwo(int power) {
        int result = 2;
        result = result << (power - 1);

        return result;
    }
}
