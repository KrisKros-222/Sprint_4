package PageObject;

import org.openqa.selenium.By;

public class MainPage {
    // Слово "Яндекс"
    public static final By YANDEX_WORD = By.xpath(".//img[@alt = 'Yandex']");
    // Слово "Самокат"
    public static final By SCOOTER_WORD = By.xpath(".//img[@alt = 'Scooter']");
    // Кнопка "Заказать" сверху
    public static final By TOP_ORDER_BUTTON = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    //Кнопка "Статус заказа"
    public static final By ORDER_STATUS_BUTTON = By.className("Header_Link__1TAG7");
    //Изображение самоката
    public static final By SCOOTER_IMAGE = By.xpath(".//img[@src='/assets/blueprint.png']");
    //Заголовок "Самокат на пару дней"
    public static final By SCOOTER_HEADER = By.className("Home_Header__iJKdX");
    //Текст под заголовком
    public static final By SCOOTER_TEXT = By.className("Home_SubHeader__zwi_E");
    //Стрелка вниз для скролла
    public static final By DOWN_ARROW = By.xpath(".//img[@alt = 'Scroll down'");
    //Кнопка "Заказать" снизу
    public static final By BOTTOM_ORDER_BUTTON = By.xpath(".//button[contains(@class,'Button_Button__ra12g Button_Middle__1CSJM')]");
    //Текст футера
    public static final By FOOTER_TEXT = By.className("App_CookieText__1sbqp");
    //Кнопка использования куки
    public static final By COOKIE_BUTTON = By.className("App_CookieButton__3cvqF");
}
