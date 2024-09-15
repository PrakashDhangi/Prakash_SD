/*
Assignment 1:
Create a simple Person class
Requirements:
    Define a class named Person with following attributes
      1. String name
       2. int age
       3. String gender
      Implement a constructor to initialize all these     attributes
     Implement getters for all attributes(name, age, gender)
implement setters for only age

Add a method displayInfo() that prints out the person details in a readable format
 */

public class Person{
    int age;
    String name;
    String gender;

    Person(int age,String name,String gender)
    {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    Person(String name,String gender)
    {
        this.name=name;
        this.gender=gender;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
public void setAge(int age){
        this.age=age;
}
    void displayInfo()
    {
        System.out.println(getAge()+" "+getName()+"  "+getGender());
    }


}



