package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    //Ссылка на страницу
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    // Слово "Яндекс"
    private static final By YANDEX_WORD = By.xpath(".//img[@alt = 'Yandex']");
    // Слово "Самокат"
    private static final By SCOOTER_WORD = By.xpath(".//img[@alt = 'Scooter']");
    // Кнопка "Заказать" сверху
    public static final By TOP_ORDER_BUTTON = By.xpath(".//button[@class = 'Button_Button__ra12g']");
    //Кнопка "Статус заказа"
    private static final By ORDER_STATUS_BUTTON = By.className("Header_Link__1TAG7");
    //Изображение самоката
    private static final By SCOOTER_IMAGE = By.xpath(".//img[@src='/assets/blueprint.png']");
    //Заголовок "Самокат на пару дней"
    private static final By SCOOTER_HEADER = By.className("Home_Header__iJKdX");
    //Текст под заголовком
    private static final By SCOOTER_TEXT = By.className("Home_SubHeader__zwi_E");
    //Стрелка вниз для скролла
    private static final By DOWN_ARROW = By.xpath(".//img[@alt = 'Scroll down'");
    //Кнопка "Заказать" снизу
    public static final By BOTTOM_ORDER_BUTTON = By.xpath(".//button[contains(@class,'Button_Button__ra12g Button_Middle__1CSJM')]");
    //Текст футера
    private static final By FOOTER_TEXT = By.className("App_CookieText__1sbqp");
    //Кнопка использования куки
    public static final By COOKIE_BUTTON = By.className("App_CookieButton__3cvqF");
    // Заголовок "Вопросы о важном"
    private static final By QUESTION_HEADER = By.xpath(".//div[text() = 'Вопросы о важном']");
    //Вопрос: Сколько это стоит? И как оплатить?
    private static final By COST_AND_PAY = By.id("accordion__heading-0");
    //Ответ на первый вопрос
    private static final By COST_AND_PAY_ANSWER = By.id("accordion__panel-0");
    //Вопрос: Хочу сразу несколько самокатов! Так можно?
    private static final By SEVERAL_SCOOTERS = By.id("accordion__heading-1");
    //Ответ на второй вопрос
    private static final By SEVERAL_SCOOTERS_ANSWER = By.id("accordion__panel-1");
    //Вопрос: Как рассчитывается время аренды?
    private static final By RENT_TIME = By.id("accordion__heading-2");
    //Ответ на третий вопрос
    private static final By RENT_TIME_ANSWER = By.id("accordion__panel-2");
    //Вопрос: Можно ли заказать самокат прямо на сегодня?
    private static final By SCOOTER_TODAY = By.id("accordion__heading-3");
    //Ответ на четвертый вопрос
    private static final By SCOOTER_TODAY_ANSWER = By.id("accordion__panel-3");
    //Вопрос: Можно ли продлить заказ или вернуть самокат раньше?
    private static final By PROLONG_OR_COMEBACK = By.id("accordion__heading-4");
    //Ответ на пятый вопрос
    private static final By PROLONG_OR_COMEBACK_ANSWER = By.id("accordion__panel-4");
    //Вопрос: Вы привозите зарядку вместе с самокатом?
    private static final By IS_THERE_CHARGING = By.id("accordion__heading-5");
    //Ответ на шестой вопрос
    private static final By IS_THERE_CHARGING_ANSWER = By.id("accordion__panel-5");
    //Вопрос: Можно ли отменить заказ?
    private static final By CANCEL_ORDER = By.id("accordion__heading-6");
    //Ответ на седьмой вопрос
    private static final By CANCEL_ORDER_ANSWER = By.id("accordion__panel-6");
    //Вопрос: Я живу за МКАДом, привезёте?
    private static final By BEHIND_MKAD = By.id("accordion__heading-7");
    //Ответ на восьмой вопрос
    private static final By BEHIND_MKAD_ANSWER = By.id("accordion__panel-7");
    // Окно открытого поля с ответом на вопрос
    public static final By ACCORDION_PANEL = By.xpath(".//div[@class = 'accordion__panel' and not (@hidden)]");

    public static final String EXP_TEXT_ONE = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String EXP_TEXT_TWO = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String EXP_TEXT_THREE = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String EXP_TEXT_FOUR = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String EXP_TEXT_FIVE = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String EXP_TEXT_SIX = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String EXP_TEXT_SEVEN = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String EXP_TEXT_EIGHT = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public static final String QUESTION_ONE = "Сколько это стоит? И как оплатить?";
    public static final String QUESTION_TWO = "Хочу сразу несколько самокатов! Так можно?";
    public static final String QUESTION_THREE = "Как рассчитывается время аренды?";
    public static final String QUESTION_FOUR = "Можно ли заказать самокат прямо на сегодня?";
    public static final String QUESTION_FIVE = "Можно ли продлить заказ или вернуть самокат раньше?";
    public static final String QUESTION_SIX = "Вы привозите зарядку вместе с самокатом?";
    public static final String QUESTION_SEVEN = "Можно ли отменить заказ?";
    public static final String QUESTION_EIGHT = "Я жизу за МКАДом, привезёте?";

    // метод, который кликает на нужный нам вопрос
    public void questionFindAndClick(String questionText) {
        WebElement element = driver.findElement(By.xpath(".//div[text() = '" + questionText + "']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        driver.findElement(By.xpath(".//div[text() = '" + questionText + "']")).click();
    }

    // метод, с помощью которого будем получать текст ответа
    public String getAnswerText() {
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(ACCORDION_PANEL));
        String answer = driver.findElement(ACCORDION_PANEL).getText();
        return answer;
    }

    public void clickCookieButton() {
        driver.findElement(COOKIE_BUTTON).click();
    }

}
