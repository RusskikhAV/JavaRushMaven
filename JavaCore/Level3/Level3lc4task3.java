package JavaCore.Level3;

import java.awt.*;

/*
Лисица — это такое животное
*/

public class Level3lc4task3 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
