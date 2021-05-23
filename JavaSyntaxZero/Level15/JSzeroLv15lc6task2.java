package JavaSyntaxZero.Level15;

    /*
Готовим коктейли
*/

public class JSzeroLv15lc6task2 {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement info : stackTrace) {
            String a = info.getMethodName();
            int b = info.getLineNumber();
            String c = info.getClassName();
            String d = info.getFileName();
            System.out.printf(OUTPUT_FORMAT, a, b, c, d);
        }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
