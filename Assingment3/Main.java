package Assingment3;

public class Main {

 public static void main(String[] args) {

        //constructor single parameter
        Rectangle R1 = new Rectangle(5);
        R1.display();
        R1.area();
        R1.perimeter();

        //constructor two parameter
        Rectangle R2=new Rectangle(2,3);
        R2.display();
        R2.area();
        R2.perimeter();

        //default constructor
        Rectangle R3=new Rectangle();
        R3.display();
        R3.area();
        R3.perimeter();

 }
}
