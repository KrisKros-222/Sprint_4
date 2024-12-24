import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AnswersCompare;
//import org.openqa.selenium.firefox.FirefoxDriver;

import static pages.QuestionPage.*;
import static pages.MainPage.*;
import static pages.AnswersCompare.*;

@RunWith(Parameterized.class)
public class Questions {
    private WebDriver driver;

    private final String expectedText;
    private final By questionLocator;
    private final By answerLocator;

    public Questions(By questionLocator, By answerLocator, String expectedText) {
        this.questionLocator = questionLocator;
        this.answerLocator = answerLocator;
        this.expectedText = expectedText;
    }

    @Parameterized.Parameters
    public static Object[][] getPersonalData() {
        return new Object[][]{
                {COST_AND_PAY, COST_AND_PAY_ANSWER, EXP_TEXT_ONE},
                {SEVERAL_SCOOTERS, SEVERAL_SCOOTERS_ANSWER, EXP_TEXT_TWO},
                {RENT_TIME, RENT_TIME_ANSWER, EXP_TEXT_THREE},
                {SCOOTER_TODAY, SCOOTER_TODAY_ANSWER, EXP_TEXT_FOUR},
                {PROLONG_OR_COMEBACK, PROLONG_OR_COMEBACK_ANSWER, EXP_TEXT_FIVE},
                {IS_THERE_CHARGING, IS_THERE_CHARGING_ANSWER, EXP_TEXT_SIX},
                {CANCEL_ORDER, CANCEL_ORDER_ANSWER, EXP_TEXT_SEVEN},
                {BEHIND_MKAD, BEHIND_MKAD_ANSWER, EXP_TEXT_EIGHT},
        };
    }

    @Test
    public void QuestionPageTest() {
        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","C:\\Program Files\\WebDriver\\bin\\geckordriver-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get(URL);

        AnswersCompare compare = new AnswersCompare(driver);
        compare.questionClick(questionLocator);
        Assert.assertEquals(expectedText,compare.getAnswerText(answerLocator));

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
