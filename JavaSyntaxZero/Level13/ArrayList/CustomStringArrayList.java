package JavaSyntaxZero.Level13.ArrayList;

public class CustomStringArrayList {
    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];

    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        System.out.println(elements[size]);
        size++;

    }

    private void grow() {
        double a = 1.5d;
        this.capacity = (int) (this.capacity * a);
        String[] newElements = new String[capacity];
        for (int i = 0; i < capacity; i++) {
            if (i < elements.length) {
                newElements[i] = elements[i];
            } else {
                elements = newElements;
            }
        }
    }
}
