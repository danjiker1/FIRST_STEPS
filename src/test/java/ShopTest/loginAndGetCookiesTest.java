package ShopTest;

import ShopApi.AuthApi;
import io.restassured.http.Cookies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class loginAndGetCookiesTest {


    @Test
    public void testLoginAndGetCookies(){

        AuthApi authApi = new AuthApi();

        String email = "daniil123@mail.ru";
        String password = "password";

        Cookies cookies = authApi.loginAndGetCookies(email, password);

        assertNotNull(cookies);

        if (cookies.getValue("Nop.customer") != null) {
            System.out.println("✅ Нашли Nop.customer: " + cookies.getValue("Nop.customer"));
        } else {
            System.out.println("❌ Nop.customer не найден в ответе");
        }

    }
}
