package JavaSyntaxZero.Level12;


public class JSzeroLv12lc4task3 {
    public static int salary;

    public static void add(int increase) {
        salary += increase;
    }

    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }

}
