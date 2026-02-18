package JavaCoreExam;

import java.util.Scanner;

public class ThrowsExam {

    public static void main(String[] args) throws Exception {

        createPerson("Tom", 10);
    }

    static void createPerson(String name, int age){

        try{

            var person = new Person(name, age);
            person.print();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}

class PersonException extends Exception{

    PersonException(String message){

        super(message);
    }
}

class Person{

    private String name;
    private int age;

    Person(String name, int age) throws PersonException{

        if(name.length() < 2) throw new PersonException("Недостаточная длина имени: " + name.length());
        if(age < 1 || age > 110) throw new PersonException("Некорректный возраст: " + age);
        this.name = name;
        this.age = age;
    }

    void print(){ System.out.printf("Name: %s; Age: %d\n", name, age); }

}

