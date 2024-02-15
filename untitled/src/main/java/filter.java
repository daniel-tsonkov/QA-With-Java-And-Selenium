import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies = driver.findElements(By.xpath("search-field"));
        System.out.println(veggies.size());

        List<WebElement> filteredList = veggies.stream().filter(e -> e.getText().contains("Rice")).collect(Collectors.toList());
        System.out.println(filteredList.size());

        Assert.assertEquals(veggies, filteredList);

        System.exit(0);//
    }
}
