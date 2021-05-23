package JavaSyntaxZero.Level11;

import java.util.Arrays;

public class JSzeroLv11lc6task1 {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int n = i + 1; n < array.length; n++)
                if (array[i] == null && array[n] != null) {
                    array[i] = array[n];
                    array[n] = null;
                }
        }
    }
}
