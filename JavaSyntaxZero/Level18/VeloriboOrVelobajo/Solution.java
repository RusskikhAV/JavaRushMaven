package JavaSyntaxZero.Level18.VeloriboOrVelobajo;

import java.util.ArrayList;
import java.util.List;

/*
Вилларибо и Виллабаджо.
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
    }

    public static void createStringedOrchestra() {
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());

    }

    public static void playOrchestra() {
        for (Object a : orchestra) {
            MusicalInstrument playAll = (MusicalInstrument) a;
            playAll.play();
        }
    }
}
