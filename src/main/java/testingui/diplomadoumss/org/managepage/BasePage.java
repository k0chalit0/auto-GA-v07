package testingui.diplomadoumss.org.managepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.core.DriverManager;

public class BasePage {
    protected WebDriver webDriver;

    public BasePage() {
        this.webDriver = DriverManager.getInstance().getWebDriver();
        PageFactory.initElements(webDriver, this);
    }
}
