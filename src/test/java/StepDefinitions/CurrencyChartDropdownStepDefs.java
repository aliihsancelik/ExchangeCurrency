package StepDefinitions;

import Pages.MainPage;
import Utilities.BrowserUtil;
import Utilities.Driver;
import io.cucumber.java.en.*;
import org.apache.log4j.Logger;

import java.util.List;

import static org.junit.Assert.*;

public class CurrencyChartDropdownStepDefs {

    private static final Logger logger = Logger.getLogger(CurrencyChartDropdownStepDefs.class);

    MainPage mainPage = new MainPage();

    @Given("I am on the main page")
    public void i_am_on_the_main_page() {

        logger.info("Verifying the main page location then scrolling down to the Graph");
        assertEquals(Driver.getDriver().getTitle() , "Exchange Rate Currency Chart | moneycorp");
        BrowserUtil.pageDown();
    }

    @When("I click Currency Chart Dropdown")
    public void i_click_Currency_Chart_Dropdown() {

        logger.info("Switching the Frame and clicking the Graphs Dropdown");
        BrowserUtil.switchFrame(mainPage.graphFrame);
        BrowserUtil.waitForClickablility(mainPage.dropdownButton,5);
        BrowserUtil.waitFor(2);//Normally this is not necessary, I put just for watching the steps!
        mainPage.dropdownButton.click();
        BrowserUtil.waitFor(2);//Normally this is not necessary, I put just for watching the steps!


    }

    @Then("I should see following options")
    public void i_should_see_following_options(List<String> expectedOptions) {

        logger.info("Verifying the dropdown options with the expected ones");
        assertEquals(expectedOptions , BrowserUtil.getElementsText(mainPage.dropdownOptions));
        BrowserUtil.switchDefaultHtml();
    }


}
