package OnlineStore;

public class Product {
    private String  name;
    private double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public double getDiscount(){
        return 0.0;
    }
    public void message(){
        System.out.println("general product method");
    }

    public final void finalInfo(){
        System.out.println("productName : "+getName());
        System.out.println("productPrice : "+getPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
