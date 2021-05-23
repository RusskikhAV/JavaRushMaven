package JavaCore.Level2;


/*
Родитель класса CTO
*/

public class Level2lc12task9 {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class worker implements Businessman {
        public void workHard() {

        }
    }

    public static class CTO extends worker implements Businessman {

    }
}
