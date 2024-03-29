import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class liveDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode!!
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        //work with tables
        driver.findElement(By.xpath("//tr/th[1]")).click();
        List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
        List<String> originalList = elementsList.stream().map(WebElement::getText).toList();

        /*for (String element : originalList) {
            System.out.println(element);
        }*/

        List<String> sortedList = originalList.stream().sorted().toList();

        /*for (String element : sortedList) {
            System.out.println(element);
        }*/

        Assert.assertEquals(sortedList, originalList); //check if is sorted correctly

        List<String> price;
        do {
            List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
            price = rows.stream().filter(e -> e.getText().contains("Rice")).map(liveDemo::getPriceVeggies).toList();

            //System.out.println(price);
            price.forEach(System.out::println);

            if (price.isEmpty()) {
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        } while (price.isEmpty());

        System.exit(0);
    }

    private static String getPriceVeggies(WebElement e) {
        return e.findElement(By.xpath("following-sibling::td[1]")).getText();
        /* //replace
        String priceValue = e.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
         */
    }
}
