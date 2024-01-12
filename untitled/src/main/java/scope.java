import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class scope {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // https://rahulshettyacademy.com/AutomationPractice/
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
    }
}
