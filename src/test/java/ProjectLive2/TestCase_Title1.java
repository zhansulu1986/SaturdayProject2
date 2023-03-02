package ProjectLive2;

public class TestCase_Title1 extends UtilityClass{
    //Validate the title of demoqa.com
    // 1. Go to the website demoqa.com;
    //2. Get the title of the website;
    //url: https://demoqa.com/
  //  After opening demoqa.com you get the title ToolsQA – “DEMOQA”
    public static void main(String[] args) {
        driver.get("https://demoqa.com/");
        String title= driver.getTitle();

        System.out.println("DEMOQA");
    }
}
