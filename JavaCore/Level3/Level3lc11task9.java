package JavaCore.Level3;

import java.awt.*;

/*
Компиляция программы
*/
public class Level3lc11task9 {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        @Override
        public Color getColor() {
            return Color.ORANGE;
        }

        @Override
        public String getName() {
            return super.getName();
        }

    }
}
