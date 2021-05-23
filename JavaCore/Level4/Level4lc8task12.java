package JavaCore.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level4lc8task12 {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        System.out.println(NOD(c, d));
    }

    public static int NOD(int a, int b) {
        if (a < 0 || b < 0) {

            throw new IllegalArgumentException();
            //throw new NumberFormatException();
        }
        if (a % b == 0) {

            return b;

        }
        if (b % a == 0) {

            return a;
        }
        Integer c = null;
        for (int i = 100; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                c = i;
                break;
            }
        }
        return c;
    }

}
