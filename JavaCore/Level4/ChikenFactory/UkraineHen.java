package JavaCore.Level4.ChikenFactory;

public class UkraineHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 25;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя Страна - " + UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
