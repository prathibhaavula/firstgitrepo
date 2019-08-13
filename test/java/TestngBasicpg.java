import org.testng.annotations.*;

public class TestngBasicpg {
    @BeforeSuite
    public void setUP() {
        System.out.println("lanching browser");

    }

    @BeforeTest
    public void enterUrl() {
        System.out.println("enter url address");
    }

    @BeforeClass
    public void loginTast() {
        System.out.println("login into the app");
    }

    @BeforeMethod
    public void searchGoogleTitle() {
        System.out.println("check goolle title ois displayed");
    }

    @Test
    public void googleLogoTestone() {
        System.out.println("get the logo");
    }

    @AfterMethod
    public void googleLogoTesttwo() {
        System.out.println("fdjfdklvd");
    }

    @AfterClass
    public void logOutApp() {
        System.out.println("log out from app");
    }

    @AfterTest
    public void closeBrowser() {
        System.out.println("close the browser");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("quit");
    }

}


