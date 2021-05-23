package JavaSyntaxZero.Level13;


import java.util.ArrayList;

public class JSzeroLv13lc7task2 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Акакий"));
        students.add(new Student("Любослав"));
        students.add(new Student("Анатолий"));
        //students.add(new Thread());
        //students.add(new Student[]{new Student("Афанасий"), new Student("Платон")});
        students.add(new Student("Афанасий"));
        students.add(new Student("Платон"));
        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }

}
