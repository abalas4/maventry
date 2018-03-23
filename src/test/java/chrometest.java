import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class chrometest {
    private WebDriver driver;

    @BeforeMethod
    public void downloadandinitdriver()
    {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.get("https://www.google.com");
    }

    @Test
    public void displaypagetitle()
    {
        System.out.println(driver.getTitle());

    }
    @Parameters("searchtext")
    @Test
    public void searchtextinpage(String searchtext)
    {
        WebElement searchfield=driver.findElement(By.id("lst-ib"));
        searchfield.sendKeys(searchtext);
        searchfield.sendKeys(Keys.RETURN);

    }
    @AfterMethod
    public void closedriversession()
    {
        driver.quit();
    }
}