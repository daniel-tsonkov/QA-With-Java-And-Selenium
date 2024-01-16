import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class miscelleanous {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        //driver.manage().window().fullscreen();
        driver.get("https://abv.bg/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));



        System.exit(0);
    }
}
