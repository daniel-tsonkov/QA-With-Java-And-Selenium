import java.time.Duration;
//import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {
    public static void main(String[] args) throws InterruptedException {
        String name = "Dan";
        System.setProperty("webdriver.chrome.driver", "/home/a1/Documents/chromedriver-linux64/chromedriver"); //for linux
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\dan\\Documents\\chromedriver-win64\\chromedriver.exe"); //for windows
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait 5 seconds after that report for error(no such element)

        String password = getPassword(driver);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name); //username
        driver.findElement(By.name("inputPassword")).sendKeys(password); //pass "rahulshettyacademy"
        driver.findElement(By.className("signInBtn")).click(); //button
        Thread.sleep(1000);

        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        driver.close();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click(); //open text link
        Thread.sleep(1000);

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        String[] passwordArray = passwordText.split("'");
        return passwordArray[1].split("'")[0];
    }
}
