import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class base {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        //for (WebElement product : products){
        for (int i = 0; i < products.size(); i++) {
            //System.out.println(product.getText());
            //String name = products.getText();
            String name = products.get(i).getText();

            if (name.contains("Brocolli")) {
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }
        }

        //driver.close();
    }
}
