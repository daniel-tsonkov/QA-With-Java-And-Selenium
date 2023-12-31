import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //run window in maximize mode
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3); //select 3td element from dropdown menu
        System.out.println(dropdown.getFirstSelectedOption().getText()); //get text from selected option
        dropdown.selectByVisibleText("AED"); //another way to select
        System.out.println(dropdown.getFirstSelectedOption().getText()); //get text from selected option
        dropdown.selectByValue("INR"); //another way to select
        System.out.println(dropdown.getFirstSelectedOption().getText()); //get text from selected option
    }
}
