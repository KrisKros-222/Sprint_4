package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Date;

import static pages.MainPage.BOTTOM_ORDER_BUTTON;
import static pages.MainPage.TOP_ORDER_BUTTON;

public class OrderPage {

    // Заголовок "Для кого самокат"
    private static final By ORDER_HEADER = By.className("Order_Header__BZXOb");
    // Поле ввода "Имя"
    public static final By NAME_INPUT = By.xpath(".//input[@placeholder = '* Имя']");
    // Поле ввода "Фамилия"
    public static final By LAST_NAME_INPUT = By.xpath(".//input[@placeholder = '* Фамилия']");
    // Поле ввода "Адрес"
    public static final By ADDRESS_INPUT = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    // Поле ввода "Станция метро"
    public static final By METRO_CHOOSE = By.className("select-search__input");
    // Список станций метро
    public static final By STATIONS_LIST = By.xpath(".//div[@class = 'select-search__select']/ul");
    // Поле с названием станции
    public static final By STATION_NAME = By.xpath(".//div[@class = 'select-search__select']/ul/li[1]");
    // Поле ввода "Телефон"
    public static final By PHONE_INPUT = By.xpath(".//input[contains(@placeholder,'* Телефон')]");
    // Кнопка "Далее"
    public static final By NEXT_BUTTON= By.xpath(".//button[text()='Далее']");
    // Заголовок "Про аренду"
    private static final By ABOUT_ORDER_HEADER = By.className("Order_Header__BZXOb");
    // Поле ввода "Когда привезти"
    public static final By DATE_CHOOSE = By.className("react-datepicker__input-container");
    // Текущий месяц
    public static final By CURRENT_MONTH = By.className("react-datepicker__current-month");
    // Поле ввода "Время аренды"
    public static final By TIME_CHOOSE = By.className("Dropdown-placeholder");
    // Выпадающее меню выбора количества суток
    public static final By DROPDOWN_TIME_MENU = By.className("Dropdown-menu");
    // Выбор конкретного количества суток
    public static final By TWO_DAYS_TIME = By.xpath(".//div[@class = 'Dropdown-option' and text()='двое суток']");
    // Поле ввода "Цвет самоката"
    private static final By COLOUR_CHOOSE = By.className("Order_Title__3EKne");
    // Поле ввода "Комментарий"
    private static final By COMMENTS = By.xpath(".//input[contains(@placeholder,'Комментарий')]");
    // Кнопка "Назад"
    private static final By BACK_BUTTON = By.className("Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i");
    // Кнопка "Заказать"
    public static final By ORDER_BUTTON = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");
    // Окно подтверждения оформления заказа
    public static final By PLACE_ORDER_WINDOW = By.className("Order_Modal__YZ-d3");
    // Текст "Хотите оформить заказ?"
    private static final By WANT_ORDER_TEXT = By.className("Order_ModalHeader__3FDaJ");
    // Кнопка "Да"
    public static final By YES_BUTTON = By.xpath(".//button[text() = 'Да']");
    // Кнопка "Нет"
    private static final By NO_BUTTON = By.xpath(".//button[text() = 'Нет']");

    private WebDriver driver;
    public OrderPage(WebDriver driver){
        this.driver = driver;
    }

    public void bottomOrderButtonClick() {
        WebElement element = driver.findElement(BOTTOM_ORDER_BUTTON);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        driver.findElement(BOTTOM_ORDER_BUTTON).click();
    }

    public void topOrderButtonClick() {
        driver.findElement(TOP_ORDER_BUTTON).click();
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
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(STATIONS_LIST));
        driver.findElement(STATION_NAME).click();
    }

    public void inputPhone(String phoneNumber){
        driver.findElement(PHONE_INPUT).sendKeys(phoneNumber);
    }

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

    public void chooseDate() {
        Date current = new Date();
        driver.findElement(DATE_CHOOSE).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(CURRENT_MONTH));
        driver.findElement(By.xpath(".//div[text() = '" + (current.getDate()+1) + "']")).click();
    }

    public void chooseTime() {
        driver.findElement(TIME_CHOOSE).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(DROPDOWN_TIME_MENU));
        driver.findElement(TWO_DAYS_TIME).click();
    }

    public void clickOrderButton() {
        driver.findElement(ORDER_BUTTON).click();
    }

    public void placeOrderOrNot() {
        new WebDriverWait(driver,3).until(ExpectedConditions.elementToBeClickable(PLACE_ORDER_WINDOW));
        driver.findElement(YES_BUTTON).click();
    }

    public void secondOrderPart(){
        chooseDate();
        chooseTime();
        clickOrderButton();
        placeOrderOrNot();
    }

    public boolean isOrderSuccess() {
        WebElement orderWindow = new WebDriverWait(driver,3)
                .until(ExpectedConditions.visibilityOfElementLocated(PLACE_ORDER_WINDOW));
        return orderWindow.isDisplayed();
    }

}
