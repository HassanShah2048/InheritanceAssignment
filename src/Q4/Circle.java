package Q4;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

//    public void calculateArea(int radius){
//        double area=Math.PI *(radius*radius);
//        System.out.println("the area of circle is : "+area);
//    }

    @Override
    public void calculateArea() {
        double area=Math.PI *(radius*radius);
        System.out.println("the area of circle is : "+area);
    }
}
