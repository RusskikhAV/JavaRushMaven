package JavaSyntaxZero.Level18.Drive;

public interface Vehicle {
    default void start() {
        System.out.println("Начинаю движение.");
    }

    void move();

    default void stop() {
        System.out.println("Останавливаюсь.");
    }
}
