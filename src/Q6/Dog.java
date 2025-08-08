package Q6;

public class Dog extends Animal{
    Dog(){
        super();
        System.out.println("dog created");
    }
    public void makeSound(){
        super.makeSound();
        System.out.println("dog is barking");
    }
}
