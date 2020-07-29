package com.MadisonIsland.step_definitions;

import com.MadisonIsland.pages.FilterPage;
import com.MadisonIsland.pages.HomePage;
import com.MadisonIsland.utilities.ConfigurationReader;
import com.MadisonIsland.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class PriceValidationStepDefs {

    HomePage homePage =new HomePage();

    FilterPage filterPage = new FilterPage();

    @Given("user should click {string} from main menu and {string} from submeonu")
    public void user_should_click_from_main_menu_and_from_submeonu(String menu, String submenu) {
        Driver.get().navigate().to(ConfigurationReader.get("url"));
        homePage.navigateToSubMenu(menu, submenu);
    }
    @Then("user should filter products according to price range between {int} and {int}")
    public void user_should_filter_products_according_to_price_range_between_and(Integer minValue,Integer maxValue) {
        String minValueString= minValue.toString();
        String maxValueString = maxValue.toString();
        filterPage.findPriceRange(minValueString, maxValueString);
    }


    @Then("prices should be betwwen {int} and {int}")
    public void prices_should_be_betwwen_and(Integer minValue, Integer maxValue) {
        boolean flag= filterPage.checkPriceRange(minValue,maxValue);
        Assert.assertTrue(flag);

    }
    @Then("user should validate filter applied correctly")
    public void user_should_validate_filter_applied_correctly() {

    }


}
