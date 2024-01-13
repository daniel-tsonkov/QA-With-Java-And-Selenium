import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class scope {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/AutomationPractice/"); // https://rahulshettyacademy.com/AutomationPractice/
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        System.out.println(driver.findElements((By.tagName("a"))).size()); // all a tagname in page

        WebElement footerDriver = driver.findElement(By.id("gf-BIG")); // scope to a tagname  only in scope
        System.out.println(footerDriver.findElements((By.tagName("a"))).size()); // only in footer

        WebElement coloumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); // web element limited to first column of footer
        System.out.println(coloumnDriver.findElements((By.tagName("a"))).size()); // only in first coloum of footer

        int countOfColoumnElements = coloumnDriver.findElements((By.tagName("a"))).size();
        //Thread.sleep(5000);
        for (int i = 1; i < countOfColoumnElements; i++) {
            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            coloumnDriver.findElements((By.tagName("a"))).get(i).sendKeys(clickOnLinkTab); //open link in new TAB


        }
        //open all the tabs
        Set<String> titlwWindows = driver.getWindowHandles();

        for (String titlwWindow : titlwWindows) {
            driver.switchTo().window(titlwWindow);
            System.out.println(driver.getTitle());
        }

        System.exit(0);
    }
}
