package ProjectLive2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestCase3_SelectableButton3 extends UtilityClass{
    public static void main(String[] args) throws InterruptedException {
        /*
        Validate selecting multiple items with ctrl/cmd button and selecting the selected item

Go to the url:
https://demoqa.com/selectable/
Press ctrl/cmd button;
Click Item 1 on the selectable list;
Click Item 2 on the selectable list;
Click Item 3 on the selectable list;
Click Item 2 on the selectable list;
Release ctrl/cmd button;
After selecting Item 1, 2 and 3 with ctrl/cmd button and selecting Item 2 once again, you should see only Item 2 is highlighted
         */
        driver.get("https://demoqa.com/selectable/");

        WebElement first=driver.findElement(By.xpath("//li[@class='mt-2 list-group-item list-group-item-action'][1]"));
        WebElement second=driver.findElement(By.xpath("//li[@class='mt-2 list-group-item list-group-item-action'][2]"));
        WebElement third=driver.findElement(By.xpath("//li[@class='mt-2 list-group-item list-group-item-action'][3]"));
        Actions actions=new Actions(driver);
        Action cmd1=actions.keyDown(Keys.COMMAND).moveToElement(first).click().build();
        cmd1.perform();
        Thread.sleep(2000);
        Action cmd2=actions.keyDown(Keys.COMMAND).moveToElement(second).click().build();
        cmd2.perform();
        Thread.sleep(2000);
        Action cmd3=actions.keyDown(Keys.COMMAND).moveToElement(third).click().build();
        cmd3.perform();
        Action cmdRelease=actions.keyUp(Keys.COMMAND).build();
        cmdRelease.perform();
        second.click();

    }
}
