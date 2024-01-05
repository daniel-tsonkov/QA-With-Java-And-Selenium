import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //select from calendar current date

        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) { //update to 1
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click(); //lection No60

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click(); //using id as cssSelector
        //driver.findElement(By.cssSelector("input[value='Search']")).click(); //second way
        //driver.findElement(By.xpath("//input[@value='Search']")).click(); //third way
        driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click(); //fourth way

        //driver.close();
    }
}
