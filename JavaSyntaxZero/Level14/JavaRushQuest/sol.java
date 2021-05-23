package JavaSyntaxZero.Level14.JavaRushQuest;

public class sol {
    public static void main(String[] args) {
        JavarushQuest[] javarushQuests = JavarushQuest.values();
        for (int i = 0; i < javarushQuests.length; i++) {
            System.out.println(javarushQuests[i].ordinal());
        }
    }
}
