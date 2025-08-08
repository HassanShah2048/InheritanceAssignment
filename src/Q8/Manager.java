package Q8;
public class Manager extends Employ{
    private double bonus;

//    Constructor
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void details(){
        super.details();
        System.out.println("Bonus : "+getBonus());
        System.out.println("Total Salary : "+(getSalary()+getBonus()));
    }


//    Getter setter

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
