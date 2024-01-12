import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class frameTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        //System.out.println(driver.findElements((By.tagName("iframe"))).size());
        //driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); //nee to switch to the frame
        driver.switchTo().frame(0);

        Actions action = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        action.dragAndDrop(source, target).build().perform();

        driver.switchTo().defaultContent(); //switch back to main content frame
        //driver.findElement(By.xpath("//input[@id='username']")).click();

        System.exit(0);
    }
}
