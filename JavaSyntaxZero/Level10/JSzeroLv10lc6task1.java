package JavaSyntaxZero.Level10;

import java.util.Arrays;
import java.util.StringTokenizer;

public class JSzeroLv10lc6task1 {
    public static void main(String[] args) {
        String packagePath = "com.javarush.task.pro.task09.task0915";
        String[] tokens = getTokens(packagePath, ".a");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokinizer = new StringTokenizer(query, delimiter);
        String[] token = new String[tokinizer.countTokens()];
        int i = 0;
        while (tokinizer.hasMoreTokens()) {
            token[i++] = tokinizer.nextToken();
        }
        System.out.println(Arrays.toString(token));
        return token;
    }
}
