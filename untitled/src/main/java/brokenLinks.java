import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class brokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        //SoftAssert assert = new  SoftAssert();
        SoftAssert a = new SoftAssert();

        for (WebElement link : links) {
            String url = link.getAttribute("href");
            System.out.println(url);

            HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();

            int responseCode = connection.getResponseCode();
            a.assertTrue(responseCode < 400, "fail test " + link.getText()  + responseCode);

            /*if (responseCode > 400) {
                System.out.println("fail test " + link.getText());
                System.out.println(responseCode);
                Assert.fail();
            }*/
        }

        /*String url = driver.findElement(By.cssSelector("a[href*='']")).getAttribute("href");
        System.out.println(url);

        HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        int responseCode = connection.getResponseCode();
        System.out.println(responseCode);*/

        System.exit(0);
    }
}
