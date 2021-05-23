package JavaSyntaxZero.Level10;

public class JSzeroLv10lc5task3v2 {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int index = path.indexOf("/");
        int index2 = path.indexOf("/", index + 2);
        int index3 = path.indexOf("/", index2 + 1);
        int index4 = path.indexOf("/", index3 + 2);
        String first = path.substring(index, index3 + 1);
        String last = path.substring(index4);
        String result = first + jdk + last;
        return result;
    }
}
