package JavaSyntaxZero.Level10;

public class JSzeroLv10lc7task2 {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder build = new StringBuilder(string);
        build.reverse();
        return build.toString();
    }
}
