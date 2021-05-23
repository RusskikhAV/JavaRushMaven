package JavaSyntaxZero.Level10;

public class JSzeroLv10lc6task2 {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут . Я буду зарабатывать $ в месяц.";
        String phrase1 = String.format("Меня зовут %s. ", name);
        String phrase2 = String.format("Я буду зарабатывать %d$ в месяц.", salary);
        String res = phrase1 + phrase2;
        return res;
    }
}
