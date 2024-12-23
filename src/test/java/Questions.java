import org.junit.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static PageObject.QuestionPage.*;

public class Questions {

    private WebDriver driver;
    @Test
    public void QuestionPageTest() {
        WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver","C:\\Program Files\\WebDriver\\bin\\geckordriver-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement element = driver.findElement(COST_AND_PAY);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);
        driver.findElement(COST_AND_PAY).click();
        String expectedTextOne = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String firstAnswer = driver.findElement(COST_AND_PAY_ANSWER).getText();
        Assert.assertEquals(expectedTextOne,firstAnswer);

        driver.findElement(SEVERAL_SCOOTERS).click();
        String expectedTextTwo = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String secondAnswer = driver.findElement(SEVERAL_SCOOTERS_ANSWER).getText();
        Assert.assertEquals(expectedTextTwo,secondAnswer);

        driver.findElement(RENT_TIME).click();
        String expectedTextThree = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String thirdAnswer = driver.findElement(RENT_TIME_ANSWER).getText();
        Assert.assertEquals(expectedTextThree,thirdAnswer);

        driver.findElement(SCOOTER_TODAY).click();
        String expectedTextFour = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String fourthAnswer = driver.findElement(SCOOTER_TODAY_ANSWER).getText();
        Assert.assertEquals(expectedTextFour,fourthAnswer);

        driver.findElement(PROLONG_OR_COMEBACK).click();
        String expectedTextFive = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String fifthAnswer = driver.findElement(PROLONG_OR_COMEBACK_ANSWER).getText();
        Assert.assertEquals(expectedTextFive,fifthAnswer);

        driver.findElement(IS_THERE_CHARGING).click();
        String expectedTextSix = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String sixthAnswer = driver.findElement(IS_THERE_CHARGING_ANSWER).getText();
        Assert.assertEquals(expectedTextSix,sixthAnswer);

        driver.findElement(CANCEL_ORDER).click();
        String expectedTextSeven = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String seventhAnswer = driver.findElement(CANCEL_ORDER_ANSWER).getText();
        Assert.assertEquals(expectedTextSeven,seventhAnswer);

        WebElement elementTwo = driver.findElement(BEHIND_MKAD);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",elementTwo);
        driver.findElement(BEHIND_MKAD).click();
        String expectedTextEight = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String eighthAnswer = driver.findElement(BEHIND_MKAD_ANSWER).getText();
        Assert.assertEquals(expectedTextEight,eighthAnswer);

    }




}
