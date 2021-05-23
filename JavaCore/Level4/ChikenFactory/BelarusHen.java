package JavaCore.Level4.ChikenFactory;

public class BelarusHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 15;
    }

    @Override
    String getDescription() {

        return super.getDescription() + String.format(" Моя страна - %s. Я несу %d яиц в месяц.", Country.RUSSIA, getCountOfEggsPerMonth());

    }
}
