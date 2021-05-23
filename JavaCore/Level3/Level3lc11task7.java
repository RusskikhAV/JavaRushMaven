package JavaCore.Level3;

/*
Интерфейс SimpleObject
*/
public class Level3lc11task7 {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {

            return StringObject.this;
        }
    }
}
