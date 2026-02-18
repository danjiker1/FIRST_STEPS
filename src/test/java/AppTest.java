import org.junit.jupiter.api.*;

public class AppTest {

    Calculator calculator = new Calculator();

    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll выполнено");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach выполнено");
    }

    @Tag("DEV")
    @Test
    void testCalcOne()
    {
        System.out.println("Тест №1 выполнен");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }

    @Tag("PROD")
    @Disabled
    @Test
    void testCalcTwo()
    {
        System.out.println("Тест №2 выполнен");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }

    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach выполнен");
    }

    @AfterAll
    static void tear(){
        System.out.println("@AfterAll выполнен");
    }

    
}