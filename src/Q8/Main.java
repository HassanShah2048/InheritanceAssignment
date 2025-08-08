package Q8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter no of Managers : ");
        int a=scanner.nextInt();

        Manager [] manager=new Manager[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter the details of Manager "+(i+1)+": ");

            System.out.print("Enter Name : ");
            String name=scanner.next();

            System.out.print("Enter Salary : ");
            double salary=scanner.nextDouble();

            System.out.print("Enter Bonus : ");
            double bonus=scanner.nextDouble();

            manager[i]=new  Manager(name,salary,bonus);
        }
        System.out.println("-------Manager Details------- : ");
        for (int i = 0; i < a; i++) {
            manager[i].details();
            System.out.println("-------");
        }
    }
}
