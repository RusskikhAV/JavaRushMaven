package JavaSyntaxZero.Level10;


public class JSzeroLv10lc6task3 {
    public static void main(String[] args) {
        String first = new String("JavaRush");
        String second = new String("JavaRush");
        String third = new String("javarush");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        String a = first.intern();
        String b = second.intern();
        if (a == b) {
            return true;
        } else
            return false;
    }
}
