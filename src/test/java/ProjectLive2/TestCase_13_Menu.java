package ProjectLive2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class TestCase_13_Menu extends UtilityClass{
    public static void main(String[] args) {
         /*
    1- Go to the url:  https://demoqa.com/menu/
    2- hover over the Main Item 2 , then sub sub list , then sub sub item 1
     -----
    After hover over the elements you should see the color change and other elements appeared.
     */


            driver.get("https://demoqa.com/menu ");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            Actions action = new Actions(driver);
            WebElement mainItem = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
            wait.until(ExpectedConditions.visibilityOf(mainItem));
            Action hoverOverMainItem = action.moveToElement(mainItem).build();
            hoverOverMainItem.perform();

            WebElement subList = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST')]"));
            Action hoverOverSubList = action.moveToElement(subList).build();
            hoverOverSubList.perform();
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            WebElement subItem1 = driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"));
            Action hoverOverSubItem1 = action.moveToElement(subItem1).build();
            action.click().build().perform();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            subItem1.click();
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Assert.assertEquals(subItem1.getText(), "Sub Sub Item 1");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            String currentUrl = driver.getCurrentUrl();
            System.out.println(currentUrl.contains("Sub Sub Item 1"));


        }
    }


