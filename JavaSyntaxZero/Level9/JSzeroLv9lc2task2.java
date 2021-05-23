package JavaSyntaxZero.Level9;

import java.util.Random;

public class JSzeroLv9lc2task2 {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random r = new Random();
        int x = r.nextInt(7) + 1;
        String[] a = new String[8];
        a[0] = CERTAIN;
        a[1] = DEFINITELY;
        a[2] = MOST_LIKELY;
        a[3] = OUTLOOK_GOOD;
        a[4] = ASK_AGAIN_LATER;
        a[5] = TRY_AGAIN;
        a[6] = NO;
        a[7] = VERY_DOUBTFUL;
        System.out.println(a[x]);
        if (x >= 0 && x < 8) {
            return a[x];
        } else
            return null;
    }

    public static void main(String[] args) {
        getPrediction();
    }
}
