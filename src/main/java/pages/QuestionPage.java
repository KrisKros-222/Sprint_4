package pages;

import org.openqa.selenium.By;

public class QuestionPage {
    // Заголовок "Вопросы о важном"
    public static final By QUESTION_HEADER = By.xpath(".//div[text() = 'Вопросы о важном']");
    //Вопрос: Сколько это стоит? И как оплатить?
    public static final By COST_AND_PAY = By.id("accordion__heading-0");
    //Ответ на первый вопрос
    public static final By COST_AND_PAY_ANSWER = By.id("accordion__panel-0");
    //Вопрос: Хочу сразу несколько самокатов! Так можно?
    public static final By SEVERAL_SCOOTERS = By.id("accordion__heading-1");
    //Ответ на второй вопрос
    public static final By SEVERAL_SCOOTERS_ANSWER = By.id("accordion__panel-1");
    //Вопрос: Как рассчитывается время аренды?
    public static final By RENT_TIME = By.id("accordion__heading-2");
    //Ответ на третий вопрос
    public static final By RENT_TIME_ANSWER = By.id("accordion__panel-2");
    //Вопрос: Можно ли заказать самокат прямо на сегодня?
    public static final By SCOOTER_TODAY = By.id("accordion__heading-3");
    //Ответ на четвертый вопрос
    public static final By SCOOTER_TODAY_ANSWER = By.id("accordion__panel-3");
    //Вопрос: Можно ли продлить заказ или вернуть самокат раньше?
    public static final By PROLONG_OR_COMEBACK = By.id("accordion__heading-4");
    //Ответ на пятый вопрос
    public static final By PROLONG_OR_COMEBACK_ANSWER = By.id("accordion__panel-4");
    //Вопрос: Вы привозите зарядку вместе с самокатом?
    public static final By IS_THERE_CHARGING = By.id("accordion__heading-5");
    //Ответ на шестой вопрос
    public static final By IS_THERE_CHARGING_ANSWER = By.id("accordion__panel-5");
    //Вопрос: Можно ли отменить заказ?
    public static final By CANCEL_ORDER = By.id("accordion__heading-6");
    //Ответ на седьмой вопрос
    public static final By CANCEL_ORDER_ANSWER = By.id("accordion__panel-6");
    //Вопрос: Я живу за МКАДом, привезёте?
    public static final By BEHIND_MKAD = By.id("accordion__heading-7");
    //Ответ на восьмой вопрос
    public static final By BEHIND_MKAD_ANSWER = By.id("accordion__panel-7");

}
