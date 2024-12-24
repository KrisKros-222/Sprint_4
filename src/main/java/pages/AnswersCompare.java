package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import static pages.QuestionPage.*;

public class AnswersCompare {

    private WebDriver driver;
    public AnswersCompare(WebDriver driver) {
        this.driver = driver;
    }
    public static final String EXP_TEXT_ONE = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String EXP_TEXT_TWO = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String EXP_TEXT_THREE = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String EXP_TEXT_FOUR = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String EXP_TEXT_FIVE = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String EXP_TEXT_SIX = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String EXP_TEXT_SEVEN = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String EXP_TEXT_EIGHT = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    // метод, который кликает на нужный нам вопрос
    public void questionClick(By questionLocator) {
        WebElement element = driver.findElement(questionLocator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        driver.findElement(questionLocator).click();
    }

    // метод, с помощью которого будем получать текст ответа
    public String getAnswerText(By answerLocator) {
        new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOfElementLocated(answerLocator));
        String answer = driver.findElement(answerLocator).getText();
        return answer;
    }
}
