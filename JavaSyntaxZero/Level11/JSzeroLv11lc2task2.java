package JavaSyntaxZero.Level11;

public class JSzeroLv11lc2task2 {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
    public int floor;
    public String devoloper;

    public JSzeroLv11lc2task2() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    public JSzeroLv11lc2task2(int floor) {
        this.floor = floor;
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floor);
    }

    public JSzeroLv11lc2task2(String devoloper) {
        this.devoloper = devoloper;
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + devoloper);
    }

    public static void main(String[] args) {
        var skyscraper = new JSzeroLv11lc2task2();
        var skyscraperTower = new JSzeroLv11lc2task2(50);
        var skyscraperSkyline = new JSzeroLv11lc2task2("JavaRushDevelopment");
    }
}
