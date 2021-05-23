package JavaSyntaxZero.Level7;

/*
Добро пожаловать! Но не всем.
*/
public class JSzeroLv7lc3task1 {
    public static void main(String[] args) {

    }

    public static void signIn(String username) {
        if (username.equals("user"))
            return;
        System.out.println("Добро пожаловать " + username);
        System.out.println("Очень скучали по Вам, " + username);
    }
}
