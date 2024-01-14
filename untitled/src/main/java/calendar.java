import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

public class calendar {
    public static void main(String[] args) {
        //WebDriver driver = new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        //driver.findElement(By.id("form-field-travel_comp_date")).click();
        driver.findElement(By.xpath(".//*[@id='form-field-travel_comp_date']")).click();
        List<WebElement> dates = driver.findElements(By.className("day"));

        int count = driver.findElements(By.className("day")).size();

        for (int i = 0; i < count; i++) {
            String day = driver.findElements(By.className("day")).get(i).getText();

            if (day.equalsIgnoreCase("23")) {
                driver.findElements(By.className("day")).get(i).click();
                break;
            }
        }

        System.exit(0);
    }
}
