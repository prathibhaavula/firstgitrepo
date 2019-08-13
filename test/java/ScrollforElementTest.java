import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import static org.junit.Assert.*;

public class ScrollforElementTest {
    public static WebDriver driver;
@Test
    public void scrollBY(){

    System.setProperty("webdriver.chrome.driver","C:\\Users\\ksaip\\Downloads\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.walmart.com");
    JavascriptExecutor js = ((JavascriptExecutor)driver);
    WebElement ele = driver.findElement(By.xpath("//a[text()='See How']"));
    js.executeScript("arguments[0].scrollIntoView(true);",ele);
    System.out.println(ele.getText());
    }
}

