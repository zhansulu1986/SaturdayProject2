package ProjectLive2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



public class TestCase_Title2 extends UtilityClass{
    /* Validate the working of interaction button functionality
     * 1. Go to the website demoqa.com;
     * 2. Click the “interaction” button on top menu list;
     * url: https://demoqa.com/
     *Expected results: You should be able to get current url “ https://demoqa.com/interaction/ “
     */
    public static void main(String[] args) {
        driver.get("https://demoqa.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,500)");
                // scrolled down by 3000 pixels

        WebElement interaction= driver.findElement(By.xpath("//h5[text()='Interactions']"));
      interaction.click();
      driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());

    }
}


