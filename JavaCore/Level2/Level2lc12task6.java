package JavaCore.Level2;

/*
Лазать, летать и бегать
*/
public class Level2lc12task6 {

    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public class Cat implements CanClimb, CanRun {
        public void climb() {
        }

        public void run() {

        }
    }

    public class Dog implements CanRun {
        public void run() {

        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
        public void run() {

        }

        public void fly() {

        }
    }
}
