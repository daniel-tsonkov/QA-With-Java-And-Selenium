import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        ArrayList<String> string = new ArrayList<>();
        string.add("asd");

        System.out.println(string.stream().filter(s -> s.startsWith("a")).count());

        driver.close();
        System.exit(0);
    }
}
