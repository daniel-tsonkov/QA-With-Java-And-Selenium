import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://www.amazon.com/");
        //WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20)); //after on Selenium 4.xx

        Thread.sleep(20000);
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']")); //local variable
        a.moveToElement(move).build().perform();
    }
}
