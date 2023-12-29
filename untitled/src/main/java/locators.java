import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "/home/a1/Documents/chromedriver-linux64/chromedriver"); //for linux
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dan\\Documents\\chromedriver-win64\\chromedriver.exe"); //for windows
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("rahul123");
        driver.findElement(By.className("signInBtn")).click();
    }
}
