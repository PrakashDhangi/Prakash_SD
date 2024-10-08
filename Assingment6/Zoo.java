package Assingment6;

public class Zoo {
    public static void main(String[] args) {
        //approach-1
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        Lion l = new Lion();

        c.sound();
        d.sound();
        l.sound();

        //approach-2
        Animal[] a1 = new Animal[3];
        a1[0] = new Cat();
        a1[1] = new Dog();
        a1[2] = new Lion();

        for (int i = 0; i <= a1.length - 1; i++) {
            a1[i].sound();


            //Approach3
            Animal[] animals = {new Cat(), new Dog(), new Lion()};
            for (Animal animal : animals) {
                animal.sound();

            }

        }
    }
}

