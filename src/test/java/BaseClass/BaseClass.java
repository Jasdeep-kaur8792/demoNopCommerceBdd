package BaseClass;
import Pages.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
public class BaseClass {
    static WebDriver driver;
    protected static PageFactory pageFactory;
//    static By username= By.xpath("//input[@placeholder='Username']");
//    static By passwordInput= By.xpath("//input[@placeholder='Password']");
    public static void setup() throws IOException, InterruptedException {
        FileReader reader = new FileReader("C:\\Users\\JasdeepKaur\\demoNopCommerce\\src\\test\\java\\TestData\\config.properties");
        Properties data = new Properties();
        data.load(reader);
        WebDriver driver = null;
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        Thread.sleep(3000);
        driver.get(data.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        pageFactory = new PageFactory(driver);
        driver.manage().window().maximize();
//        driver.findElement(username).sendKeys(data.getProperty("userName"));
//        driver.findElement(passwordInput).sendKeys(data.getProperty("password"));
    }

    public void close()
    {
        driver.close();
    }
}