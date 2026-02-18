package RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


public class ApiTestDemoQa {
    @Test
    void checkBooks() {
        given()
                .when()
                .log().uri()
                .log().body()
                .get("https://demoqa.com/BookStore/v1/Books")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("books.isbn", hasItem("9781449325862"));
    }
}
