package OnlineStore;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 20.0;
    }

    @Override
    public void message() {
        System.out.println("Clothing sale today!");
    }
}
