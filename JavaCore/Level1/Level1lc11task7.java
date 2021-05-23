package JavaCore.Level1;

import java.util.Arrays;

public class Level1lc11task7 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0) {
                x = inputArray[i];
                y = inputArray[i];
            }
            if (inputArray[i] < x) {
                x = inputArray[i];
            }
            if (inputArray[i] > y) {
                y = inputArray[i];
            }
        }

        return new Pair<Integer, Integer>(x, y);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
