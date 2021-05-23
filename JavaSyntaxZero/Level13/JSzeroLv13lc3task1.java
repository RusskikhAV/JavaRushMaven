package JavaSyntaxZero.Level13;

import java.util.ArrayList;

public class JSzeroLv13lc3task1 {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");


    }

    public static void main(String[] args) {
        initEmployees();

    }

    public static void paySalary(String name) {
        if (name == null) {
            System.out.println("Null");
        } else if (waitingEmployees.contains(name)) {
            for (int i = 0; i < waitingEmployees.size(); i++) {
                alreadyGotSalaryEmployees.add(i, waitingEmployees.get(i));
                waitingEmployees.set(i, null);
            }
        }
    }
}
