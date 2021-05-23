package JavaCore.Level5;

public class Level5lc2task1 {
    /*
ООП - Расставить интерфейсы
*/

    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        @Override
        public Object getAllowedAction() {
            Object obj = new Object();
            return obj;
        }

        @Override
        public Object getAllowedAction(String name) {
            Object obj = new Object();
            return obj;
        }

        @Override
        public boolean isMovable() {
            return true;
        }
    }
}

