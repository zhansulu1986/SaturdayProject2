package ProjectLive2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable_8 extends UtilityClass {
    public static void main(String[] args) throws InterruptedException {
        /**
         * As a user I want to be able to validate resizing the element vertically.
         *
         * Validate resizing the element horizontally
         *
         * Go to the url:
         *
         * DEMOQA
         *
         * 2.Drag a mouse from the right side of the element by 100 px to the right;
         *
         * Expected results:
         *
         * You should see the element is resized horizontally by 100 px*/


        driver.get("https://demoqa.com/resizable/");
        Actions actions = new Actions(driver);

        WebElement dragMe = driver.findElement(By.xpath("//span[@class='react-resizable-handle react-resizable-handle-se']"));
        Thread.sleep(3000);
        actions.dragAndDropBy(dragMe, 100, 0).build().perform();

//        dragMe.getText();
//        ////div[@text='Resizable box, starting at 200x200. Min size is 150x150, max is 500x300.']
//
//        WebElement location = driver.findElement(By.xpath("//div[@style='width: 200px; height: 200px;']"));
//        String actualResult = location.getAttribute("");
//        System.out.println("Actual Result is: " + actualResult);







    }
}
