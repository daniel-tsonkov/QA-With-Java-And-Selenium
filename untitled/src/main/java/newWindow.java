import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class newWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        driver.switchTo().newWindow(WindowType.TAB);

        Set<String> handles = Collections.singleton(driver.getWindowHandle());
        Iterator<String> iterator = handles.iterator();
        String parentWindow = iterator.next();
        String childWindow = iterator.next();
        driver.switchTo().window(childWindow);


        System.exit(0);
    }
}
