import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DayTwoTest {
    @Test
    public void ploan() {
        System.out.println("AAA");
    }

    @BeforeTest
    public void prerequister() {
        System.out.println("First execute");
    }
}
