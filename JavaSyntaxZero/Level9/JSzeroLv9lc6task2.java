package JavaSyntaxZero.Level9;

public class JSzeroLv9lc6task2 {
    public static int setFlag(int number, int flagPos) {
        number = number | (1 << flagPos);
        return number;
    }

    public static int resetFlag(int number, int flagPos) {
        number = number & ~(1 << flagPos);
        return number;
    }

    public static boolean checkFlag(int number, int flagPos) {
        if ((number & (1 << flagPos)) == (1 << flagPos)) {
            return true;
        } else
            return false;
    }
}
