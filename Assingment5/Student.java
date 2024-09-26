package Assingment5;

public class Student extends Person{
    char grade;

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void display()
    {
        System.out.println(name+"   "+age+"  "+grade);

    }
}
