package ProjectLive2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class TestCase_14_Slider extends UtilityClass {
    public static void main(String[] args) {
        /*
        1. Go to the url: https://demoqa.com/slider/
2. Move the slider by dragging a mouse to the release point;
You should see slider moves by dragging a mouse to the release point
         */

            driver.get("https://demoqa.com/slider/");

            WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));
            Assert.assertTrue(slider.isDisplayed());
            String beforeValue = slider.getAttribute("value");

            Actions actions = new Actions(driver);

            Action draggingMouse = actions.clickAndHold(slider).moveByOffset(50, 0).build();
            draggingMouse.perform();

            String afterValue = slider.getAttribute("value");

            Assert.assertNotEquals(afterValue, beforeValue);

            Wait(2);

            quitDriver(2);
        }
    }



