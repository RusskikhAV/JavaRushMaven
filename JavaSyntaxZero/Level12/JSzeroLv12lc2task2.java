package JavaSyntaxZero.Level12;

public class JSzeroLv12lc2task2 {
    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printSize() {
        System.out.println("Height = " + height);
        System.out.println("Width = " + width);
    }
}

class Solution {
    public static void main(String[] args) {
        JSzeroLv12lc2task2 window = new JSzeroLv12lc2task2();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}

