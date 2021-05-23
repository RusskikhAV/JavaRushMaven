package JavaCore.Level3;

public class Level3lc2task9 {
    public static void main(String[] args) {

    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }
}
