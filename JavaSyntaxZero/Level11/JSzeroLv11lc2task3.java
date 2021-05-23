package JavaSyntaxZero.Level11;

public class JSzeroLv11lc2task3 {
    private int floorsCount;
    private String developer;

    public JSzeroLv11lc2task3() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public JSzeroLv11lc2task3(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        var skyscraper = new JSzeroLv11lc2task3();
        var skyscraperUnknown = new JSzeroLv11lc2task3(50, "Неизвестно");
    }
}
