import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class maventry
{
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    maventry(char browser)
    {
        switch(browser)
        {
            case 'e':
                WebDriverManager.edgedriver().setup();
                setDriver(new EdgeDriver());
                break;
            case 'c':
                WebDriverManager.chromedriver().setup();
                setDriver(new ChromeDriver());
                break;
        }
    }
}

/*
class mavenimplement{
    public static void main(String args[] ){
        maventry a = new maventry('c');
        WebDriver driver=a.getDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.quit();

    }

}*/
