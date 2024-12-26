import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
//import org.openqa.selenium.firefox.FirefoxDriver;

import static pages.MainPage.*;


@RunWith(Parameterized.class)
public class Questions {
    private WebDriver driver;

    private final String expectedText;
    private final String questionText;


    public Questions(String questionText, String expectedText) {
        this.questionText = questionText;
        this.expectedText = expectedText;
    }

    @Parameterized.Parameters
    public static Object[][] getPersonalData() {
        return new Object[][]{
                {QUESTION_ONE, EXP_TEXT_ONE},
                {QUESTION_TWO, EXP_TEXT_TWO},
                {QUESTION_THREE, EXP_TEXT_THREE},
                {QUESTION_FOUR, EXP_TEXT_FOUR},
                {QUESTION_FIVE, EXP_TEXT_FIVE},
                {QUESTION_SIX, EXP_TEXT_SIX},
                {QUESTION_SEVEN, EXP_TEXT_SEVEN},
                {QUESTION_EIGHT, EXP_TEXT_EIGHT},
        };
    }

    @Test
    public void QuestionPageTest() {
        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","C:\\Program Files\\WebDriver\\bin\\geckordriver-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get(URL);

        MainPage compare = new MainPage(driver);
        compare.questionFindAndClick(questionText);
        Assert.assertEquals(expectedText,compare.getAnswerText());

    }
    @After
    public void tearDown(){
        driver.quit();
    }

}
