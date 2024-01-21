//import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class miscelleanous {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        //driver.manage().window().fullscreen();
        //driver.manage().deleteAllCookies(); //delete all cookie from browser
        driver.get("https://abv.bg/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //create screenshot on window
        //FileUtils.copyFile(src, new File("C:\\Users\\dan\\Pictures\\pic.png")); //Don't put directly to C: (admin rools)

        System.exit(0);
    }
}
