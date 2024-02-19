import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DayCTest {
    @Test
    public void ploa() {
        System.out.println("Day C1");
    }

    @Test
    public void ploaa() {
        System.out.println("Day C2");
    }

    @BeforeSuite
    public void beforSuit() {
        System.out.println("Before suit From C");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before every method in this clas from C");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After every method in this clas from C");
    }
}
