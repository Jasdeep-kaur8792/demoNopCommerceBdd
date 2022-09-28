package Pages;

import org.openqa.selenium.WebDriver;

public class PageFactory {
    WebDriver driver;
    private AddItems addComputerItems;
    private Register registerPage;
    private Apparel apparelPage;

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
    public Register getRegisterPage()
    {
        if (registerPage == null) {
            registerPage = new Register(driver);
        }
        return registerPage;
    }
    public Apparel getApparelPage()
    {
        if ( apparelPage== null) {
            apparelPage = new Apparel(driver);
        }
        return apparelPage;
    }
}

