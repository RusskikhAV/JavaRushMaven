package JavaSyntaxZero.Level12;

public class JSzeroLv12lc3task1 {
    Engine engine = new Engine();

    public static void main(String[] args) {

    }

    class Engine {
        private boolean isRunning;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }
}
