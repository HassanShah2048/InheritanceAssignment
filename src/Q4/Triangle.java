package Q4;
public class Triangle extends Shape{
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
//    public void calculateArea(double base, double height){
//        double area=0.5*base*height;
//        System.out.println("the area of Triangle is : "+area);
//    }

    @Override
    public void calculateArea() {
        double area=0.5*base*height;
        System.out.println("the area of Triangle is : "+area);
    }
}
