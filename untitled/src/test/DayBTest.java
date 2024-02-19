import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DayBTest {
    @Test
    public void ploan() {
        System.out.println("Day B");
    }

    @BeforeTest
    public void prerequister() {
        System.out.println("First execute From B");
    }
}
