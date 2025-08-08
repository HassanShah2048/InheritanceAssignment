package Q1;

public class Student extends Person {
    private int rollNo;
    private int  marks;
    public void displayInfo(){
        super.displayInfo();
        System.out.println("rollNo "+rollNo);
        System.out.println("marks  "+marks);
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
