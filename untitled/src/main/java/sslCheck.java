import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class sslCheck {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        Proxy proxy = new Proxy();
        proxy.setHttpProxy("proxy example(ipaddress:4444");
        options.setCapability("proxy", proxy);
        //EdgeOptions options1 = new EdgeOptions(); // for Edge
        options.setAcceptInsecureCerts(true);
        //options1.setAcceptInsecureCerts(true);

        /*WebDriver driver1 = new EdgeDriver(options1);
        driver1.manage().window().maximize(); //run window in maximize mode
        driver1.get("https://expired.badssl.com/");
        driver1.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        System.out.println(driver1.getTitle());*/

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://expired.badssl.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        System.out.println(driver.getTitle());

        System.exit(0);
    }
}
