package test.setup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {

    public static WebDriver driver;

    @Before
    public void setWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com");
    }

    @After
    public void closeWebDriver(){
        if(driver != null){
            driver.quit();
        }
    }
}