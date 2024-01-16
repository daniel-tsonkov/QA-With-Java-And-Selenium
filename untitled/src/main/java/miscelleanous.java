import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class miscelleanous {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        //driver.manage().window().fullscreen();
        //driver.manage().deleteAllCookies(); //delete all cookie from browser
        driver.get("https://abv.bg/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //create screenshot on window

        System.exit(0);
    }
}
