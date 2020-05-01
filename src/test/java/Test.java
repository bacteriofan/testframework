import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

    @org.testng.annotations.Test
    public void launchBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://hamwaves.com/collaboration/doc/rypress.com/index.html");
        System.out.println("Browser title is " + driver.getTitle());
        driver.quit();
    }
}
