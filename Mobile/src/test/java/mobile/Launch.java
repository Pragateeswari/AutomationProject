package mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
    WebDriver driver;
    @Test
    public void Launching_the_Browser()
    {
       
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.azurewebsites.net/");
        driver.manage().window().maximize();

    }
}
