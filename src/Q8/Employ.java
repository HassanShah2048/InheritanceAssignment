package Q8;

public class Employ {
    private  String name;
    private  double salary;

//    Constructor

    public Employ(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void details(){
        System.out.println("name : "+getName());
        System.out.println("Salary : "+getSalary());
    }


//    Getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
