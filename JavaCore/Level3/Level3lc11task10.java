package JavaCore.Level3;

import java.awt.*;

/*
Один метод в классе
*/
public class Level3lc11task10 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
