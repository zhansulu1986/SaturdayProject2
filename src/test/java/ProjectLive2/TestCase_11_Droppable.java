package ProjectLive2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static ProjectLive2.UtilityClass.driver;

public class TestCase_11_Droppable extends UtilityClass{
    public static void main(String[] args) {
        /*
        1. Go to the url: https://demoqa.com/droppable/
2. Drag the element to the target;
After dragging the element to the target, you should see the element
 is within the target square and the target square
 is colored blue with inscription „Dropped!”
         */
        driver.get(" https://demoqa.com/droppable/");

        //<div id="draggable" class="drag-box mt-4 ui-draggable ui-draggable-handle"
        // style="position: relative;">Drag me</div>
        WebElement drag = driver.findElement(By.id("draggable"));

        //<div id="droppable" class="drop-box ui-droppable"><p>Drop here</p></div>
        WebElement drop = driver.findElement(By.id("droppable"));
        String beforeBackgroundColor = drop.getCssValue("background-color");

        Actions actions = new Actions(driver);
        Action dragAndDrop = actions.dragAndDrop(drag, drop).build();
        dragAndDrop.perform();

        String afterBackgroundColor = drop.getCssValue("background-color");

        Assert.assertNotEquals(beforeBackgroundColor, afterBackgroundColor, "Test background color is not successful");
        Assert.assertTrue(drop.getText().equals("Dropped!"), "Test is not successful");
    }
    }


