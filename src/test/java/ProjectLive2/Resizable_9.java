package ProjectLive2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static ProjectLive2.UtilityClass.driver;

public class Resizable_9 extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {
        //    Validate resizing the element vertically
//
//    Go to the url:
//
//    DEMOQA
//
//2. Drag a mouse from the bottom side of the element by 100 px down;
//
//    You should see the element is resized horizontally by 200 px

        driver.get("https://demoqa.com/resizable/");
        Actions actions = new Actions(driver);

        WebElement dragMe = driver.findElement(By.xpath("//span[@class='react-resizable-handle react-resizable-handle-se']"));
        Thread.sleep(3000);
        actions.dragAndDropBy(dragMe, 100, 100).build().perform();






    }
}


