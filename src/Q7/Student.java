package Q7;

public class Student extends Person {
    private String fieldDepart;

    public void printDetails(){
        super.printDetails();
        System.out.println("My fieldDepart is "+getFieldDepart());
    }

    public Student(String fieldDepart) {
        super("Hassan","2323345");
        this.fieldDepart = fieldDepart;
    }

    public String getFieldDepart() {
        return fieldDepart;
    }

    public void setFieldDepart(String fieldDepart) {
        this.fieldDepart = fieldDepart;
    }
}
