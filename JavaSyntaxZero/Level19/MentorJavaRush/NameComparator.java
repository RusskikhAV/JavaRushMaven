package JavaSyntaxZero.Level19.MentorJavaRush;


import java.util.Comparator;

public class NameComparator implements Comparator<JavaRushMentor> {

    @Override
    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2) {
        if (mentor1.getName().length() < mentor2.getName().length()) {
            return -1;
        } else if (mentor1.getName().length() > mentor2.getName().length()) {
            return 1;
        } else return 0;
    }
};
