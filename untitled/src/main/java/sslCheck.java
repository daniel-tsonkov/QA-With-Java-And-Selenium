import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class sslCheck {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://expired.badssl.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        System.out.println(driver.getTitle());

        System.exit(0);
    }
}
