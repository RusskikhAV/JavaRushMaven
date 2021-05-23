package JavaSyntaxZero.Level11;

public class Iphone {

    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object iphones) {
        if (iphones == this) {
            return true;
        }
        if (iphones == null || getClass() != iphones.getClass()) {
            return false;
        }
        Iphone iphone1 = (Iphone) iphones;
        return price == iphone1.price && model.equals(iphone1.model) && color.equals(iphone1.color);
    }

    public static void main(String[] args) {
        var iphone1 = new Iphone("X", "Black", 999);
        var iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
