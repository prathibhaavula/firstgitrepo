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

    private String first_name;


    private String last_name ;

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

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

