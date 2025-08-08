package Q4;

public class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    public void calculateArea(int length , int width){
//        double area=length*width;
//        System.out.println("the area of Rectangle is : "+area);
//    }

    @Override
    public void calculateArea() {
        double area=length*width;
        System.out.println("the area of Rectangle is : "+area);
    }
}
