import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class javaScriptExecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 450)"); //scroll main window 500px down
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=500"); //scroll one of the table from main window
        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));

        int sum = 0;

        for (WebElement value : values) {
            sum += Integer.parseInt(value.getText()); //sum of all values from 4th column
        }

        System.out.println(sum);

        int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

        System.out.println(total);

        Assert.assertEquals(sum, total); //if fail it will be troll exception

        System.exit(0);
    }
}
