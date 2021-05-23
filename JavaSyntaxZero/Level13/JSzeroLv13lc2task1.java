package JavaSyntaxZero.Level13;

public class JSzeroLv13lc2task1 {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        int bil = Integer.parseInt(bill);
        balance -= bil;
    }
}
