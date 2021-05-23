package JavaSyntaxZero.Level12;


import java.util.ArrayList;
import java.util.List;

public class JSzeroLv12lc4task4 {
    public List<String> students;

    public void UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        students.removeIf(excludedStudent::equals);

    }

    public static void main(String[] args) {
        JSzeroLv12lc4task4 universityGroup = new JSzeroLv12lc4task4();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }

}
