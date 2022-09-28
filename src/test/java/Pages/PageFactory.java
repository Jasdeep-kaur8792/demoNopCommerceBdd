package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private AddItems addComputerItems;

    public PageFactory(WebDriver driver)
    {
        this.driver = driver;

    }

    public AddItems getAddComputerItems()
    {
        if (addComputerItems == null) {
            addComputerItems = new AddItems(driver);
        }
        return addComputerItems;
    }
}
