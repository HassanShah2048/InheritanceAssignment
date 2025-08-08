package Q1;

public class Person {
    private  String name;
    private  int age;

    public void displayInfo(){
        System.out.println("Name is "+name);
        System.out.println("age is "+age);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
