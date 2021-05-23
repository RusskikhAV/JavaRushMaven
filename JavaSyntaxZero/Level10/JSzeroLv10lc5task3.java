package JavaSyntaxZero.Level10;

public class JSzeroLv10lc5task3 {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        path = path.replaceAll("jdk1.8", jdk);
        return path;
    }
}
