package Encapsulation;

public class GetterSetterDemo {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    void display(){
        System.out.println(getAge()+"  "+getName());
    }

    public static void main(String[] args) {
        GetterSetterDemo gs=new GetterSetterDemo();
        gs.setAge(26);
        gs.setName("prakash");
        gs.display();
        System.out.println(gs.getAge());
        System.out.println(gs.getName());
    }
}

