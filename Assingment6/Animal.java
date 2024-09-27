package Assingment6;

public class Animal {

    public void sound() {
        System.out.println("sound is.....");
    }
}

    class Dog extends Animal {
        public void sound() {
            System.out.println("Dog sounds Bark");
        }
    }

     class Cat extends Animal {
        public void sound() {
            System.out.println("Cat sounds Meow");
        }
    }

    class Lion extends Animal {
        public void sound() {
            System.out.println("Lion sounds Roar");
        }
    }




