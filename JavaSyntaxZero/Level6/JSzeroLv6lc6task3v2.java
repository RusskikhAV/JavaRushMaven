package JavaSyntaxZero.Level6;
/*
3D Массив
*/

import java.util.Arrays;

public class JSzeroLv6lc6task3v2 {

    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};

    public static void main(String[] args) {
        String multy = Arrays.deepToString(multiArray);
        System.out.println(multy);
    }
}
