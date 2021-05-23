package JavaSyntaxZero.Level11;

import java.util.Objects;

public class JSzeroLv11lc5task3 {
    private String model;
    private int year;

    public JSzeroLv11lc5task3(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    public static void main(String[] args) {
        var lamborghini = new JSzeroLv11lc5task3("Lamborghini", 2020);
        var lamborghini1 = new JSzeroLv11lc5task3("Lamborghini", 2020);
        var ferrari = new JSzeroLv11lc5task3("Ferrari", 2020);
        var ferrari1 = new JSzeroLv11lc5task3("Ferrari", 2020);
        var bugatti = new JSzeroLv11lc5task3("Bugatti", 2020);
        var bugatti1 = new JSzeroLv11lc5task3("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
