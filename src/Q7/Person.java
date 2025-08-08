package Q7;

public class Person {
    private String name;
    private String CNIC;




    public Person(String name, String CNIC) {
        this.name = name;
        this.CNIC = CNIC;
    }

    public void printDetails(){
        System.out.println("my name is "+getName());
        System.out.println("my CNIC is "+getCNIC());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }
}
