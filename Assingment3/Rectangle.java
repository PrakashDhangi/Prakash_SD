package Assingment3;

public class Rectangle {
    double length;
    double width;

    void area() {
        double area=length*width;
        System.out.println("area of rectangle : "+area);
    }
    void perimeter() {
        double perimeter=2*(length+width);
        System.out.println("perimeter of rectangle  : "+perimeter);
    }
    void display() {
        System.out.println("length is : "+length);
        System.out.println("width id : "+width);
    }
  // Overloading Constructors

    public Rectangle()
    {
        this.length=1;
        this.width=1;
    }
    public Rectangle(double square){
        this.length=square;
        this.width=square;
    }
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
}
