package JavaSyntaxZero.Level14;

import java.util.HashMap;

public class JSzeroLv14lc4task1 {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Котович Барсик", 4.5);
        grades.put("Котейкин Борис", 4.2);
        grades.put("Котовский Васька", 4.0);
        grades.put("Котейкина Маруся", 3.8);
        grades.put("Кошкин Джек", 4.0);
    }
}
