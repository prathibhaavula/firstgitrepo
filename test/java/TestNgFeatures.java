import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgFeatures {
    @Test
    public void loginTest() {
        System.out.println("login into google page");
    }
/*
    @Test(dependsOnMethods = {"loginTest()"})
    public void homePageTest() {
        System.out.println("homepage test");
    }
    */

    @Test
    public void searchPageTest() {
        System.out.println("serach page test");
    }

    @Test(invocationCount = 3)
    public void sum() {
        int a = 10;
        int b = 40;
        int c = a + b;
        System.out.println("sum :" + c);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void abcOne(){
        String s = "100H";
        Integer.parseInt(s);
    }
        @Test(priority = 1, enabled = false)
        public void eanbleMethod () {
            System.out.println("bla bal bla");
        }

    }



