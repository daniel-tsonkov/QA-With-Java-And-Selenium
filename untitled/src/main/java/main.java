import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/a1/Documents/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/watch?v=RveELNiBD5Q");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
