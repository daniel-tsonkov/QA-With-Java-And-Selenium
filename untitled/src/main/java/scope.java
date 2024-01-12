import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class scope {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // https://rahulshettyacademy.com/AutomationPractice/
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        System.out.println(driver.findElements((By.tagName("a"))).size()); // all a tagname in page

        WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // scope to a tagname  only in scope
        System.out.println(footerDriver.findElements((By.tagName("a"))).size()); // only in footer

        System.exit(0);
    }
}
