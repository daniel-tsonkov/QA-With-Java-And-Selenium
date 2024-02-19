import org.testng.annotations.*;

public class DayCTest {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Executing before avery method in this class from C");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Executing after avery method in this class from C");
    }

    @Test(groups = {"groupA"})
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
