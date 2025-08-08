package Q3;

public class Main3 {
    public static void main(String[] args) {
        //       - Call each method in main() using the parent class reference.


        Bank bank=new Bank();
//        bank.getInterestRate();

        bank=new SBI();
        bank.getInterestRate();

        bank=new HBL();
        bank.getInterestRate();

        bank=new MeezanBank();
        bank.getInterestRate();
    }
}
