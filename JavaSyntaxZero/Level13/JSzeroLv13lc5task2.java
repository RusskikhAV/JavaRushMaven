package JavaSyntaxZero.Level13;

import java.util.ArrayList;
import java.util.Arrays;

public class JSzeroLv13lc5task2 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        programmingLanguages.remove(programmingLanguages.size() - 1);
        programmingLanguages.remove(programmingLanguages.size() - 2);
        programmingLanguages.remove(programmingLanguages.size() - 3);
        programmingLanguages.remove(programmingLanguages.size() - 4);
        programmingLanguages.remove(programmingLanguages.size() - 2);
        programmingLanguages.remove(programmingLanguages.size() - 2);

        System.out.println(programmingLanguages);
    }
}
