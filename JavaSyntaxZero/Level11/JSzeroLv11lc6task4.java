package JavaSyntaxZero.Level11;

public class JSzeroLv11lc6task4 {
    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        JSzeroLv11lc6task4 He = new JSzeroLv11lc6task4();
        He.eat(apple);
    }

    public static class Apple {
    }
}
