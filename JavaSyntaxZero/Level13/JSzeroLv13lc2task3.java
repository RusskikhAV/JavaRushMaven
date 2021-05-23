package JavaSyntaxZero.Level13;

public class JSzeroLv13lc2task3 {
    public static void main(String[] args) {
        String string = """
                Думаю, это будет новой фичей.
                Только не говорите никому, что она возникла случайно.
                """;

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        char[] a = string.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        char[] a = string.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (Character.isLetter(a[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        char[] a = string.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (Character.isSpaceChar(a[i])) {
                count++;
            }
        }
        return count;
    }
}


