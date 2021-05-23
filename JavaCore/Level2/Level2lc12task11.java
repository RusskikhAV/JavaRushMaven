package JavaCore.Level2;

    /*
Ненужные абстракции
*/

public class Level2lc12task11 {

    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public abstract void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public void fly() {

        }
    }

    public abstract static class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }
}
