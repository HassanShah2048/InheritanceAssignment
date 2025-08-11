package OnlineStore;
public class Main {
    public static void main(String[] args) {
        Product [] items= {new Electronic("Laptop",100000),
                new Grocery("Milk",1000),
                new Clothing("T-shirt",500)};
        for (int i = 0; i < items.length; i++) {
            items[i].finalInfo();
            System.out.println("Discount "+items[i].getDiscount()+"%");
            items[i].message();
            System.out.println("-------------------");
        }
    }
}
