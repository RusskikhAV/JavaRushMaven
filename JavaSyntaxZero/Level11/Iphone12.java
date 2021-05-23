package JavaSyntaxZero.Level11;

import java.util.Objects;

public class Iphone12 {

    private String model;
    private String color;
    private int price;

    public Iphone12(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iphone12 iphone1 = (Iphone12) o;
        return price == iphone1.price && model.equals(iphone1.model) && color.equals(iphone1.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price);
    }


    public static void main(String[] args) {
        var iphone1 = new Iphone12("X", "Black", 999);
        var iphone2 = new Iphone12("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
