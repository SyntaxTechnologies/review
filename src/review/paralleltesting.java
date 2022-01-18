package review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class paralleltesting {

@Test(groups="regression")
public void launchBrowser() {
    System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum@nhrm123");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
//    get the welcome admin message and verify that you have sucessfuly logged in

    WebElement msg = driver.findElement(By.cssSelector("a#welcome"));
    String actualmsg = msg.getText();
    String expectedmsg="Welcome Admi";
    SoftAssert soft =new SoftAssert();
//    assertion
    soft.assertEquals(expectedmsg,actualmsg);
    System.out.println("i am here");
    soft.assertAll();
}


    @Test(groups="regression")
    public void launchBrowser2() {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Hum");
        driver.findElement(By.xpath("//input[@type='submit']")).click();


    }
}
