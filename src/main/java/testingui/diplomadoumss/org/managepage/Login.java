package testingui.diplomadoumss.org.managepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

public class Login extends BasePage {

    public Login() {
        super();
        webDriver.get(PropertyAccesor.getInstance().getURL());
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@name='email' and @type='text']")
    private WebElement emailLogin;

    @FindBy(xpath = "//input[@name='password' and @type='password']")
    private WebElement passwordLogin;

    @FindBy(xpath = "//button[@type='submit' and @class]")
    private WebElement buttonLogin;

    public void setCredentials  (String email, String password){
        emailLogin.sendKeys(email);
        passwordLogin.sendKeys(password);
        buttonLogin.click();
    }
}
