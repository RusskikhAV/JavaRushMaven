package JavaSyntaxZero.Level15.Lection3Task2;

public class Lion {
    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("ищет еду");
            System.out.println("нашел " + food.name);
            System.out.println("все съел");
        } catch (NullPointerException e) {
            System.out.println("ничего не нашел");
            return;
        } finally {
            if (food == null)
                System.out.println("лег спать" + (food == null ? " голодным" : ""));
        }
        System.out.println("лег спать" + (food == null ? " голодным" : ""));
    }
}
