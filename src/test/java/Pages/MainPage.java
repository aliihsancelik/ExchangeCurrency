package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "rategraphiframe")
    public WebElement graphFrame;

    @FindBy(css = ".timescale")
    public WebElement dropdownButton;

    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//li")
    public List<WebElement> dropdownOptions;
}
