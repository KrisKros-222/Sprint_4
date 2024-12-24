package pages;

import org.openqa.selenium.By;

public class OrderPage {

    // Заголовок "Для кого самокат"
    public static final By ORDER_HEADER = By.className("Order_Header__BZXOb");
    // Поле ввода "Имя"
    public static final By NAME_INPUT = By.xpath(".//input[@placeholder = '* Имя']");
    // Поле ввода "Фамилия"
    public static final By LAST_NAME_INPUT = By.xpath(".//input[@placeholder = '* Фамилия']");
    // Поле ввода "Адрес"
    public static final By ADDRESS_INPUT = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    // Поле ввода "Станция метро"
    public static final By METRO_CHOOSE = By.className("select-search__input");

    public static final By STATIONS_LIST = By.xpath(".//div[@class = 'select-search__select']/ul");
    // Поле с названием станции
    public static final By STATION_NAME = By.xpath(".//div[@class = 'select-search__select']/ul/li[1]");
    // Поле ввода "Телефон"
    public static final By PHONE_INPUT = By.xpath(".//input[contains(@placeholder,'* Телефон')]");
    // Кнопка "Далее"
    public static final By NEXT_BUTTON= By.xpath(".//button[text()='Далее']");
    // Заголовок "Про аренду"
    public static final By ABOUT_ORDER_HEADER = By.className("Order_Header__BZXOb");
    // Поле ввода "Когда привезти"
    public static final By DATE_CHOOSE = By.className("react-datepicker__input-container");

    public static final By CURRENT_MONTH = By.className("react-datepicker__current-month");

    // Поле ввода "Время аренды"
    public static final By TIME_CHOOSE = By.className("Dropdown-placeholder");

    public static final By DROPDOWN_TIME_MENU = By.className("Dropdown-menu");

    public static final By TWO_DAYS_TIME = By.xpath(".//div[@class = 'Dropdown-option' and text()='двое суток']");
    // Поле ввода "Цвет самоката"
    public static final By COLOUR_CHOOSE = By.className("Order_Title__3EKne");
    // Поле ввода "Комментарий"
    public static final By COMMENTS = By.xpath(".//input[contains(@placeholder,'Комментарий')]");
    // Кнопка "Назад"
    public static final By BACK_BUTTON = By.className("Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i");
    // Кнопка "Заказать"
    public static final By ORDER_BUTTON = By.xpath(".//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    public static final By PLACE_ORDER_WINDOW = By.className("Order_Modal__YZ-d3");
    // Текст "Хотите оформить заказ?"
    public static final By WANT_ORDER_TEXT = By.className("Order_ModalHeader__3FDaJ");
    // Кнопка "Да"
    public static final By YES_BUTTON = By.xpath(".//button[text() = 'Да']");
    // Кнопка "Нет"
    public static final By NO_BUTTON = By.xpath(".//button[text() = 'Нет']");

}
