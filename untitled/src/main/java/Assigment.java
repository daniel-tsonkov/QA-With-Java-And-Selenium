import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {
    public static void main(String[] args) {
        String text = "Dan";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click(); //cssSelector - "[id='alertbtn']"

        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept(); //when work with POPUP

        driver.close();
    }
}
