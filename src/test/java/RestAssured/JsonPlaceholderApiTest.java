package RestAssured;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.*;

public class JsonPlaceholderApiTest {


    private static final Logger log = LoggerFactory.getLogger(JsonPlaceholderApiTest.class);

    @Test
    void postsTest() {

        String userId = "{\"userId\": 1}";

        given()
                .log().uri()
                .log().body()
                .contentType(JSON)
                .body(userId)
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("userId", is(1));
    }

    @Test
    void postCreateTest(){
        String newPost = "{ \"userId\": 25, \"id\": 25, " +
                "\"title\": \"privet\", " +
                "\"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\" }";
                        given()
                                .log().uri()
                                .log().body()
                                .contentType(JSON)
                                .body(newPost)
                                .when()
                                .post("https://jsonplaceholder.typicode.com/posts")
                                .then()
                                .log().status()
                                .log().body()
                                .statusCode(201)
                                .body("userId",is(25))
                                .body("title", equalTo("privet"))
                                .body("body",containsString("et"))
                                .body("id", notNullValue());

    }



    @Test
    void allCommentsTest() {

//        String userId = "{\"userId\": 1}";

        given()
                .log().uri()
                .log().body()
                .contentType(JSON)
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1/comments")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("postId", everyItem(is(1)));
    }


    @Test
    void firstCommentsTest(){
        given()
                .log().uri()
                .log().body()
                .contentType(JSON)
                .when()
                .get("https://jsonplaceholder.typicode.com/comments?postId=1")
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .body("[0].id",is(1));
    }





}