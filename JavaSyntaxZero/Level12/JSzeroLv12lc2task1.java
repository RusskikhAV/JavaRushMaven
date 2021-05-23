package JavaSyntaxZero.Level12;

public class JSzeroLv12lc2task1 {
    public static void main(String[] args) {
        String string = "12.84";
        System.out.println(string);
        double a = Double.parseDouble(string);
        System.out.println(a);
        long b = Math.round(a);
        System.out.println(b);
    }
}
