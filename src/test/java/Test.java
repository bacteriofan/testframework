import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
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
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);


        driver.navigate().to("https://developer.mozilla.org/en-US/docs/Web/Tutorials");

        System.out.println("Browser title is: " + driver.getTitle());

        driver.findElement(By.xpath("//a[text()[contains(.,'Introduction to HTML')]]")).click();
        String header = driver.findElement(By.cssSelector(".title")).getText();

        System.out.println("Opened page:" + header);

        driver.quit();
    }
}
