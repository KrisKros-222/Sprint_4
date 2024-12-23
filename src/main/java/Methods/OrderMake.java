package Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static PageObject.MainPage.BOTTOM_ORDER_BUTTON;
import static PageObject.OrderPage.*;

public class OrderMake {

    private WebDriver driver;
    public OrderMake(WebDriver driver){
        this.driver = driver;
    }

    public static final By CURRENT_MONTH = By.className("react-datepicker__current-month");
    public static final By CURRENT_DATE = By.xpath(".//div[@aria-label = 'Choose пятница, 27-е декабря 2024 г.']");
    public static final By STATION_NAME = By.xpath(".//div[@class = 'select-search__select']/ul/li[1]");

    //
    public void bottomOrderButtonClick() {
        WebElement element = driver.findElement(BOTTOM_ORDER_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        driver.findElement(BOTTOM_ORDER_BUTTON).click();
    }

    //метод заполняет поле Имя
    public void inputName(String name){
        driver.findElement(NAME_INPUT).sendKeys(name);
    }

    //метод заполняет поле фамилия
    public void inputLastName(String lastName){
        driver.findElement(LAST_NAME_INPUT).sendKeys(lastName);
    }

    //метод заполняет поле Адрес
    public void inputAddress(String address){
        driver.findElement(ADDRESS_INPUT).sendKeys(address);
    }

    //метод выбирает станцию метро
    public void chooseMetro() {
        driver.findElement(METRO_CHOOSE).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(By.xpath(".//div[@class = 'select-search__select']/ul")));
        driver.findElement(STATION_NAME).click();
    }

    //
    public void inputPhone(String phoneNumber){
        driver.findElement(PHONE_INPUT).sendKeys(phoneNumber);
    }

    //
    public void clickNextButton() {
        driver.findElement(NEXT_BUTTON).click();
    }

    public void firstOrderPart(String name, String lastName, String address, String phoneNumber){
        inputName(name);
        inputLastName(lastName);
        inputAddress(address);
        chooseMetro();
        inputPhone(phoneNumber);
        clickNextButton();
    }

    //
    public void chooseDate() {
        driver.findElement(DATE_CHOOSE).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(CURRENT_MONTH));
        driver.findElement(CURRENT_DATE).click();
    }

    //
    public void chooseTime() {
        driver.findElement(TIME_CHOOSE).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(By.className("Dropdown-menu")));
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-option' and text()='двое суток']")).click();
    }

    //
    public void clickOrderButton() {
        driver.findElement(ORDER_BUTTON).click();
    }

    public void placeOrderOrNot() {
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(By.className("Order_Modal__YZ-d3")));
        driver.findElement(YES_BUTTON).click();
    }

    public void secondOrderPart(){
        chooseDate();
        chooseTime();
        clickOrderButton();
        placeOrderOrNot();
    }

}
