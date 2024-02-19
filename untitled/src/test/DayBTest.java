import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DayBTest {
    @Test(groups = {"groupA"})
    public void ploan() {
        System.out.println("Day B1");
    }

    @Test(groups = {"groupB"})
    public void ploanb() {
        System.out.println("Day B2");
    }

    @BeforeTest
    public void prerequister() {
        System.out.println("First execute From B");
    }
}
