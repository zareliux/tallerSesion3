package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Chrome implements IBrowser{
    @Override
    public WebDriver create(){
        String rutaDriver="C:\\Users\\Zarela\\Documents\\tallerSession3\\src\\test\\resources\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",rutaDriver);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
        return driver;
    }
}

