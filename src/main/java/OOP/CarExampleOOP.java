package OOP;

public class CarExampleOOP {

    public static void main(String[] args){


        Car audi = new Car("Audi");
        audi.model = "a3";
        audi.body = "Седан";
        audi.year = 2014;

        audi.getInfo();
    }

    
    static class Car {
        private String brand;
        String model;
        int year;
        String body = "Седан";
        String color;


        Car(String brand) {
            this.brand = brand;
        }

        public String getBrand() {
            return this.brand;
        }

        public void getInfo() {
            System.out.println(brand + " " + model + " " + year + " " + body);


        }



    }



}
