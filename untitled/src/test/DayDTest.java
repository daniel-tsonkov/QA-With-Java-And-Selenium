import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class DayDTest {
    @Test(groups = {"groupA"})
    public void WebLoginHomeLoan() {
        System.out.println("Day D1");
    }

    @Test(groups = {"groupA"})
    public void MobileLoginHomeLoan() {
        System.out.println("Day D2");
    }

    @Test
    public void MobileLogOutHome() {
        System.out.println("Day D3");
    }

    @Test
    public void LoginApiHomeLoan() {
        System.out.println("Day D4");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("After fuit from D");
    }
}
