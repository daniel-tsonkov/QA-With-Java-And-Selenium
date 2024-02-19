import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DayOneTest {
    @Test
    public void Demo() {
        System.out.println("test"); //test only
    }

    @Test
    public void TestTwo() {
        System.out.println("zzz");
    }

    @AfterTest
    public void lastExecution() {
        System.out.println("This will be the last");
    }
}
