package ShopTest;

import ShopApi.AuthApi;
import ShopApi.CartApi;
import io.restassured.http.Cookies;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartTest {

    private CartApi cartApi;
    private AuthApi authApi;
    private Cookies authCookies;
    private final String email = "daniil123@mail.ru";
    private final String password = "password";
    private final int LAPTOP_ID = 31;

    @BeforeEach
    public void setUp() {
        cartApi = new CartApi();
        authApi = new AuthApi();
        // Получаем свежие куки перед каждым тестом
        authCookies = authApi.loginAndGetCookies(email, password);
        System.out.println("✅ Получены свежие куки: " + authCookies.getValue("Nop.customer"));
    }

    @Test
    public void addToCart(){
        Response response = cartApi.addToCard(authCookies, LAPTOP_ID, 1);

        assertEquals(200, response.statusCode());

        String responseBody = response.asString();
        System.out.println("=== ПОЛНЫЙ ОТВЕТ ОТ СЕРВЕРА ===");
        System.out.println(responseBody);
        System.out.println("==============================");

        assertTrue(responseBody.contains("\"success\":true"));


    }
}
