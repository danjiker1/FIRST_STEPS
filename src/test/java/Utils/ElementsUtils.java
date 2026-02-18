package Utils;

import com.github.javafaker.Faker;

public class ElementsUtils {

   private static final Faker faker = new Faker();


    public static String generateUserName(){
        return faker.name().fullName();
    }

    public static String generateEmail(){
        return faker.internet().emailAddress();
    }

    public static String generateAdress(){
        return faker.address().fullAddress();

    }



}
