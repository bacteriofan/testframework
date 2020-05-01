import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

    @org.testng.annotations.Test
    public void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://hamwaves.com/collaboration/doc/rypress.com/index.html");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
