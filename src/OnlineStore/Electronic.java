package OnlineStore;

public class Electronic extends Product {

    public Electronic(String name, double price) {
        super(name, price);
    }

    public double getDiscount(){
        return 10.0;
    }

    @Override
    public void message() {
        super.message();
        System.out.println("Electronics special message");
    }
}
