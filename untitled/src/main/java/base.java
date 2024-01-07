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

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Beans", "Apple"}; //add more items

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        //for (WebElement product : products){
        for (int i = 0; i < products.size(); i++) {
            //System.out.println(product.getText());
            //String name = products.getText();
            String name = products.get(i).getText();

            List<String> itemsNeededList = Arrays.asList(itemsNeeded); //array to listArrays

            if (itemsNeededList.contains(name)) {
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
            }
        }

        //driver.close();
    }
}
