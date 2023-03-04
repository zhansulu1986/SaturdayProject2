package ProjectLive2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Resizable_10 extends UtilityClass{
    public static void main(String[] args) throws InterruptedException {
//        Validate resizing the element diagonally
//
//        Go to the url:
//
//        DEMOQA
//
//        2. Drag a mouse diagonally left-up from the right-bottom corner of the element to its minimum size;
//
//        Expected result: You should see the element is resized diagonally to the minimum size
        driver.get("https://demoqa.com/resizable/");
        Actions actions = new Actions(driver);

        WebElement dragMe = driver.findElement(By.xpath("//span[@class='react-resizable-handle react-resizable-handle-se']"));
        Thread.sleep(3000);
        actions.dragAndDropBy(dragMe, -150, -150).build().perform();
    }

}
