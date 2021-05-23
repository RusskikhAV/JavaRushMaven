package JavaCore.Level2;

public class Level2lc6task4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "Корова";
        }
    }
}
