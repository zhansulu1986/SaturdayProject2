package ProjectLive2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase1_SelectableButton1 {
    public static void main(String[] args) {
        /*Validate the working of Selectable functionality
        1.Go to the url:https://demoqa.com/selectable/
        2. Click on Item 1 on the selectable list;
        After selecting Item 1, you should see Item 1 is highlighted*/

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/selectable/");

        WebElement first=driver.findElement(By.xpath("//li[@class='mt-2 list-group-item list-group-item-action']"));
        first.click();

//        WebElement selected=driver.findElement(By.xpath("//li[@class='mt-2 list-group-item active list-group-item-action']"));
//                //mt-2 list-group-item active list-group-item-action

        String selected = first.getAttribute("class");
        if (selected.contains("item active list")) {
            System.out.println("First item is highlighted");
        } else {
            System.out.println("First item is not highlighted");
        }
    }
}
