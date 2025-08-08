package Q7;

public class Teacher extends Student {
    private String fieldSubject;
    public void printDetails(){
        super.printDetails();
        System.out.println("My fieldSubject is "+getFieldSubject());
    }

    public Teacher(String fieldSubject) {
        super("Computer Science");
        this.fieldSubject = fieldSubject;
    }

    public String getFieldSubject() {
        return fieldSubject;
    }

    public void setFieldSubject(String fieldSubject) {
        this.fieldSubject = fieldSubject;
    }
}
