package OnlineStore;

public class Grocery extends Product {

    public Grocery(String name, double price) {
        super(name, price);
    }

    @Override
    public void message() {
        System.out.println("Fresh groceries available");
    }
}
