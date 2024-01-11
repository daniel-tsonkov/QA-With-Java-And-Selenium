import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class windowsHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));


        System.exit(0);
    }
}
