package com.MadisonIsland.step_definitions;

import com.MadisonIsland.pages.BasePage;
import com.MadisonIsland.pages.HomePage;
import com.MadisonIsland.utilities.ConfigurationReader;
import com.MadisonIsland.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

public class PriceValidationStepDefs {

    HomePage homePage =new HomePage();

    @Given("user should click {string} from main menu and {string} from submenu")
    public void user_should_click_from_main_menu_and_from_submenu(String menu, String submenu) {
        Driver.get().navigate().to(ConfigurationReader.get("url"));
        homePage.navigateToSubMenu(menu, submenu);
    }

    @Then("user should filter products according to price range between $100.{int} and $199.{int}")
    public void user_should_filter_products_according_to_price_range_between_$100_and_$199(Integer int1, Integer int2) {

    }
    @Then("user should validate filter applied correctly")
    public void user_should_validate_filter_applied_correctly() {

    }
}
