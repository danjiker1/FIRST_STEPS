package JavaCoreExam;

public class Car {
    String name;
    String model;
    int year;

    Car(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

        void getCar () {
            System.out.println("Транспорт " + name + ", модель " + model + ", год " + year);
        }


}

    class Avto extends Car{
        String type;
        int dvigatel;

        Avto(String name, String model, int year, String type, int dvigatel){
            super(name, model, year);
            this.type=type;
            this.dvigatel = dvigatel;

        }

        @Override
        void getCar(){
            super.getCar();
            System.out.println("Тип кузова: " + type + ", Двигатель: " + dvigatel + " л.");
        }
    }




