package JavaSyntaxZero.Level11;

public class JSzeroLv11lc3task1 {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public JSzeroLv11lc3task1(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public JSzeroLv11lc3task1(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
    }

    public JSzeroLv11lc3task1(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }
}
