import pages.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import pages.OrderPage;

import static pages.MainPage.*;

@RunWith(Parameterized.class)
public class BottomOrderButton {

    private WebDriver driver;

    private final String name;
    private final String lastName;
    private final String address;
    private final String phoneNumber;

    public BottomOrderButton (String name, String lastName, String address, String phoneNumber){
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getPersonalData() {
        return new Object[][]{
                {"Карина", "Истомина", "Бульвар", "+79002225566"},
                {"Полина", "Буланова", "Партизанская", "+79003335566"},
        };
    }

    @Test
    public void BottomOrderButtonTest() {

        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","C:\\Program Files\\WebDriver\\bin\\geckordriver-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get(URL);

        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton();

        OrderPage order = new OrderPage(driver);
        order.bottomOrderButtonClick();
        order.firstOrderPart(name,lastName,address,phoneNumber);
        order.secondOrderPart();
        Assert.assertTrue(order.isOrderSuccess());

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
