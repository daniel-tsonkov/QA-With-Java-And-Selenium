import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class windowsHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        driver.findElement(By.cssSelector(".blinkingText")).click();
        //start switch window
        Set<String> windows = driver.getWindowHandles(); //get all windows ID
        Iterator<String> it = windows.iterator();
        String parendId = it.next(); //id is 0
        String childId = it.next(); //id is 1

        driver.switchTo().window(childId);
        //end switch window

        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at ")[1].split(" ")[0]; //get only email as text
        System.out.println(emailId);

        driver.switchTo().window(parendId);
        driver.findElement(By.id("username")).sendKeys(emailId);

        System.exit(0);
    }
}
