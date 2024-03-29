import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class actionsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']")); //local variable
        WebElement moveToSearch = driver.findElement(By.id("twotabsearchtextbox"));
        a.moveToElement(moveToSearch).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        //build() creat operation
        //performe() execute operation
        a.moveToElement(moveToSearch).doubleClick().build().perform(); //doble click fro select text
        a.moveToElement(move).build().perform();
        a.moveToElement(move).contextClick().build().perform(); //contextClick() - RIGHT click og mouse

        System.exit(0);
    }
}
