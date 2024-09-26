package Assingment5;

public class Main {
    public static void main(String[] args) {

        //person
        Person p = new Person();
        p.setAge(25);
        p.setName("PA");
        p.display();

        System.out.println("Students details..........");
        //student
        Student s=new Student();
        s.setAge(26);
        s.setName("Prakash.SD");
        s.setGrade('A');
        s.display();

        System.out.println("teachers details..........");
        //teacher
        Teacher t=new Teacher();
        t.setName("onkar");
        t.setAge(32);
        t.setSubject("java");
        t.display();
    }
}
