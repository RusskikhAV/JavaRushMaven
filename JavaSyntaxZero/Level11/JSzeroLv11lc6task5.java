package JavaSyntaxZero.Level11;

public class JSzeroLv11lc6task5 {
    public static void showWeather(City city) {
        String a = String.format("В городе %s ", city.getName());
        String b = String.format("сегодня температура воздуха %d", city.getTemperature());
        String c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        City city = new City("lA", 15);
        showWeather(city);
    }
}