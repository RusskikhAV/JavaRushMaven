package JavaCore.Level4.ChikenFactory;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();

    }

    static class HenFactory implements Country {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(RUSSIA)) {
                hen = new RussianHen();
            }
            if (country.equals(UKRAINE)) {
                hen = new UkraineHen();
            }
            if (country.equals(MOLDOVA)) {
                hen = new MoldovanHen();
            }
            if (country.equals(BELARUS)) {
                hen = new BelarusHen();
            }
            return hen;
        }
    }
}
