package ProjectLive2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DatePicker extends UtilityClass{
    public static void main(String[] args) {
//        As a user, I want after writing a date in the format 12/21/2019 you should see a calendar with highlighted at
//        21/12/2019
//
//        Validate writing a date in format
//
//        Go to the url:
//        DEMOQA
//
//        Write the date 12/21/2019 in the
//        input field;
//
//        After writing a date in the format
//        12/21/2019 you should see a
//        calendar with highlighted date
//        21/12/2019

        driver.get("https://demoqa.com/date-picker");
        WebElement date = driver.findElement(By.id("datePickerMonthYearInput"));
        date.click();
        System.out.println();
       // Select drpDate = new Select(driver.findElement());

        ////select[@class='react-datepicker__month-select']\option

    }
}
