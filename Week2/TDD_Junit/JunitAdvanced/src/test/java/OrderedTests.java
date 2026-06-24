import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void testLogin() {
        System.out.println("1. Login Test Executed");
    }

    @Test
    @Order(2)
    void testAddProduct() {
        System.out.println("2. Add Product Test Executed");
    }

    @Test
    @Order(3)
    void testCheckout() {
        System.out.println("3. Checkout Test Executed");
    }

    @Test
    @Order(4)
    void testLogout() {
        System.out.println("4. Logout Test Executed");
    }
}