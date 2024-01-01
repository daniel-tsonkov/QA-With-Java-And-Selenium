import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsActivities {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "/home/a1/Documents/chromedriver-linux64/chromedriver"); //for linux
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\dan\\Documents\\chromedriver-win64\\chromedriver.exe"); //for windows
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize(); //run window in maximize mode

        driver.get("http://google.com");
        driver.navigate().to("http://facebook.com"); //navigate to another website
        driver.navigate().back();
        driver.navigate().forward();

    }
}
