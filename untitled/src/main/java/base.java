import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class base {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] itemsNeeded = {"Brocolli", "Cucumber", "Beetroot"}; //add more items

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            System.out.println(name[0]);

            List<String> itemsNeededList = Arrays.asList(itemsNeeded); //array to listArrays

            if (itemsNeededList.contains(formattedName)) {
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            }
        }

        //driver.close();
    }
}
