import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DayCTest {
    @Test
    public void ploa() {
        System.out.println("Day C");
    }

    @BeforeSuite
    public void beforSuit() {
        System.out.println("Before suit From C");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method From C");
    }
}
