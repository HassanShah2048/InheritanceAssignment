package Q1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student =new Student();

        student.setMarks(232);
        student.setRollNo(3);
        student.setName("Ali");
        student.setAge(19);
        System.out.println();
        student.displayInfo();
    }
}