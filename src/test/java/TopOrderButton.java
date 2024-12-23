import Methods.OrderMake;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static PageObject.MainPage.*;
import static Methods.OrderMake.*;

@RunWith(Parameterized.class)
public class TopOrderButton {

    private WebDriver driver;

    private final String name;
    private final String lastName;
    private final String address;
    private final String phoneNumber;

    public TopOrderButton (String name, String lastName, String address, String phoneNumber){
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
    public void TopOrderButtonTest() {

        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","C:\\Program Files\\WebDriver\\bin\\geckordriver-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        driver.findElement(COOKIE_BUTTON).click();
        driver.findElement(TOP_ORDER_BUTTON).click();

        OrderMake order = new OrderMake(driver);
        order.firstOrderPart(name,lastName,address,phoneNumber);
        order.secondOrderPart();

        boolean isOrderSuccess = driver.findElement(By.className("Order_Modal__YZ-d3")).isDisplayed();
        Assert.assertTrue(isOrderSuccess);

    }
    @After
    public void tearDown(){
        driver.quit();
    }
}
