package JavaSyntaxZero.Level15;

/*
Логирование стектрейса
*/

public class JSzeroLv15lc6task4 {
    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }

}
