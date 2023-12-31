import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/a1/Documents/chromedriver-linux64/chromedriver"); //for linux
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\dan\\Documents\\chromedriver-win64\\chromedriver.exe"); //for windows
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //wait 5 seconds after that report for error(no such element)

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul"); //username
        driver.findElement(By.name("inputPassword")).sendKeys("rahul123"); //pass
        driver.findElement(By.className("signInBtn")).click(); //button

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click(); //open text link
        Thread.sleep(1000); //wait for stabilize single page application

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dan"); //enter text in form
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dan@abv.bg");
        //driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("12345"); //telephone
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000); //wait for stabilize single page application

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Dan");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
    }
}
