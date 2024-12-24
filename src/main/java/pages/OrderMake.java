package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;

import static pages.MainPage.*;
import static pages.OrderPage.*;

public class OrderMake {

    private WebDriver driver;
    public OrderMake(WebDriver driver){
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
