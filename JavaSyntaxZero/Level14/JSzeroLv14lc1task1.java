package JavaSyntaxZero.Level14;

import java.util.HashSet;

public class JSzeroLv14lc1task1 {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < args.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> arr = new HashSet<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add(strings[i]);
        }
        return arr;
    }
}
