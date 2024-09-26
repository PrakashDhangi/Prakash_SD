package Assingment5;

public class Teacher extends Person {
    String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void display()
    {
        System.out.println(name+"   "+age+"  "+subject);
    }
}
