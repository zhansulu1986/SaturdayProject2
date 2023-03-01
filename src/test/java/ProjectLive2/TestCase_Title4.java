package ProjectLive2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class TestCase_Title4 extends UtilityClass{
    public static void main(String[] args) {
        /*1. Go to the website demoqa.com; done
2. Click on the “Widgets” button on top menu list;
3. Click on the “Tool Tips“ link on left sidebar;
         */
        driver.get("https://demoqa.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        WebElement widgets= driver.findElement(By.xpath("//div/h5[text()='Widgets']"));
        widgets.click();
        js.executeScript("window.scrollBy(0, 600)");
        //<span class="text">Tool Tips</span>
        WebElement tooltipBox= driver.findElement(By.xpath("//span[text()='Tool Tips']"));
        tooltipBox.click();
        String expectedResult="https://demoqa.com/tooltips";
        String actualResult=driver.getCurrentUrl();
        if(actualResult.equals(expectedResult)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        System.out.println(actualResult);
    }
}


