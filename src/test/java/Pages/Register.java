package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register {
    WebDriver driver;
    WebDriverWait wait;
    By clickOnRegisterButton = By.xpath("//button[@class='button-1 register-button']");
    By enterFirstName = By.xpath("  //input[@name='FirstName']");
    By enterLastName = By.xpath("//input[@name='LastName']");
    By emailInput = By.xpath("//input[@name='Email']");
    By enterPassword = By.xpath("//input[@name='Password']");
    By enterConfirmedPassword = By.xpath("//input[@name='ConfirmPassword']");
    By enterRegisterButton = By.xpath("  //button[contains(text(),'Register')]");
    By logOutButton = By.xpath(" //a[@class='ico-logout']");

    public Register(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void register() {
        driver.findElement(clickOnRegisterButton).click();
        driver.findElement(enterFirstName).sendKeys("as");
        driver.findElement(enterLastName).sendKeys("aur");
        driver.findElement(emailInput).sendKeys("dp@gmail.com");
        driver.findElement(enterPassword).sendKeys("password");
        driver.findElement(enterConfirmedPassword).sendKeys("password");
    }
        public void registerButton()
    {
        driver.findElement(enterRegisterButton).click();
        driver.findElement(logOutButton).click();
        }
}
