package basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.KeralaHomePage;
import pagepkg.KeralaLoginPage;

public class KeralaBaseClass {

    public static WebDriver driver;

    public KeralaLoginPage loginobj;
    public KeralaHomePage homeobj;

    @BeforeTest
    public void setup()
    {
        driver = new ChromeDriver();

        driver.get("https://keralaproperty.in/member/login/");

        driver.manage().window().maximize();

        // Wait up to 10 seconds for elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void objectmethod()
    {
        loginobj = new KeralaLoginPage(driver);
        homeobj = new KeralaHomePage(driver);
    }
}