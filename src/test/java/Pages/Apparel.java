package Pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Apparel {
    WebDriver driver;
    WebDriverWait wait;
    By clickOnApparel= By.xpath("(//a[contains(text(),'Apparel')])[1]");
    By clickOnShoes= By.xpath("(//a[contains(text(),' Shoes ')])");
    By clickOnWishlist= By.xpath("(//button[contains(text(),'Add to wishlist')])[1]");
    By selectSize= By.xpath("(//select[@class='valid'])");
    By sizeOption= By.xpath("//select//option[contains(text(),'8')]");
    By selectColour= By.xpath("(//span[@class='attribute-square'])[1]");
    By addWishList= By.xpath("//div[@class='add-to-wishlist']");
    By addWishListTop= By.xpath("//span[@class='wishlist-qty']");
    By addWishListTopVerify= By.xpath("//span[contains(text(),'AD_C80_RS')]");


    public Apparel(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void shoes()
    {
       driver.findElement(clickOnApparel).click();
        driver.findElement(clickOnShoes).click();
        driver.findElement(clickOnWishlist).click();
        driver.findElement(selectSize).click();
        driver.findElement(sizeOption).click();
        driver.findElement(selectColour).click();
        driver.findElement(addWishList).click();
        driver.findElement(addWishListTop).click();
    }
    public void verifyProduct()
    {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[contains(text(),'AD_C80_RS')]"))));
        String actual = driver.findElement(addWishListTopVerify).getText();
        Assert.isTrue(actual.equals("AD_C80_RS"), "Expected result does not match with actual result");
    }
}
