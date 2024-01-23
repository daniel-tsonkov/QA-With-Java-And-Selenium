import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        /*WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));*/

        ArrayList<String> name = new ArrayList<>();
        name.add("asd");
        name.add("asdf");
        name.add("zzzzz");

        System.out.println(name.stream().filter(s -> s.startsWith("a")).count());
        name.stream().filter(s -> s.length() > 4).limit(1).forEach(a -> System.out.println());

        //driver.close();
        //System.exit(0);
    }
}
