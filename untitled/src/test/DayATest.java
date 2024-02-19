import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DayATest {
    @Test(groups = {"groupA", "groupB"})
    public void Demo() {
        System.out.println("Day A1"); //test only
    }

    @Test
    public void TestTwo() {
        System.out.println("Day A2");
    }

    @AfterTest
    public void lastExecution() {
        System.out.println("This will be the last from A");
    }
}
