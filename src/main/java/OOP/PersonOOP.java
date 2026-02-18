package OOP;

public class PersonOOP {
    public static void main(String[] args){

        Person tom = new Person();
        tom.name = "Tom";
        tom.print();

        Employee bob = new Employee();
        bob.name = "Bob";
        bob.print();

    }
    static class Person {

        String name;

        void print(){

            System.out.println("Name: " + name);
        }
    }
    static class Employee extends Person { }
}
