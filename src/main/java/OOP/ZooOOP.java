package OOP;

public class ZooOOP {

    public static void main(String[] args){

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.swim();
        dog.name = "Бобик";
        dog.swim();


    }

    abstract static class Animal {
        void makeSound() {
            System.out.println("Издает звуки");
        }

        interface Swimmable {
            void swim();
    }

    }
    static class Dog extends Animal{

        String name;
        @Override
        void makeSound() {
            super.makeSound();
        }
        void swim(){
            System.out.println(name + " плавает");
        }

    }

    static class Cat extends Animal{
        @Override
        void makeSound() {
            super.makeSound();
        }
        void swim(){
            System.out.println("Кошка плавает");
        }
    }
}
