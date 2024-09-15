public class Main {


    public static void main(String[] args) {
        Person p = new Person(20, "prakash", "male");
        p.displayInfo();
        System.out.println(p.getAge());
        System.out.println(p.getName());
        System.out.println(p.getGender());
        p.setAge(25);
        System.out.println(p.getAge());
       Person p1=new Person("xyz","male");
       p1.displayInfo();
    }
}