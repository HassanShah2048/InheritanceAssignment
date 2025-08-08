package Q7;
public class Admin extends Teacher {
    private String fieldPosition;

    public void printDetails(){
        super.printDetails();
        System.out.println("My fieldPosition is "+fieldPosition);
    }

    public Admin(String fieldPosition) {
        super("programming");
        this.fieldPosition = fieldPosition;
    }

    public String getFieldPosition() {
        return fieldPosition;
    }

    public void setFieldPosition(String fieldPosition) {
        this.fieldPosition = fieldPosition;
    }
}
