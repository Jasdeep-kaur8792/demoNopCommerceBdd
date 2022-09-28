package StepDefinition;

import BaseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;

public class StepDefinition extends BaseClass {

    @Given("User is on home page")
    public void user_is_on_home_page() throws IOException, InterruptedException{
        setup();
    }

    @And("User click on computer module and click or add to cart product")
    public void user_click_on_computer_module_and_click_or_add_to_cart_product() {
        pageFactory.getAddComputerItems().addComputerItem();
    }
    @When("Verify product the product is added or not")
    public void verify_product_the_product_is_added_or_not(){
        pageFactory.getAddComputerItems().verifyProduct();
    }
    @Then("checkout the product")
    public void checkout_the_product() {
        pageFactory.getAddComputerItems().clickOnCheckOut();
    }
}
