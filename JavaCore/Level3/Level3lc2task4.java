package JavaCore.Level3;

public class Level3lc2task4 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Updatable, Selectable {
        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }
}
