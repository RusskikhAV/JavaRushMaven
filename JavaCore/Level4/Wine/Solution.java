package JavaCore.Level4.Wine;

    /*
Дегустация вин
*/


public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getSparklingWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Wine wine = new Wine();
        return wine;
    }

    public static Wine getWine() {
        Wine wine = new Wine();
        return wine;
    }

    public static Wine getSparklingWine() {
        SparklingWine bubblyWine = new SparklingWine();
        return bubblyWine;
    }
}
