package testingui.diplomadoumss.org.managepage.nasa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;
import testingui.diplomadoumss.org.utilsfiles.PropertyAccesor;

import static testingui.diplomadoumss.org.manageevents.Event.*;

/**
 * @author Jose Iriarte
 * @project testingui.diplomadoumss.org
 */

//*[@id="tocify-header1"]/li/a
public class NasaPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"tocify-header1\"]/li/a")
    private WebElement nasaApiListing;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/li/a")
    private WebElement earthLink;

    @FindBy(xpath = "//*[@id=\"tocify-header8\"]/ul/li[1]/a")
    private WebElement imageryLink;

    @FindBy(xpath = "/html/body/div[2]/div[2]/p[57]/code" )
    private WebElement getApiElement;

    public NasaPage() {
//        isWebElementVisible(loginButton);
        avoidToUse(2);
    }

    public NasaPage clickNasaApiListing(){
        clickWebElement(nasaApiListing);
        return this;
    }

    public NasaPage reclickNasaApiListing(){
        avoidToUse(1);
        clickWebElement(nasaApiListing);
        return this;
    }

    public NasaPage clickEarthLink() {
        avoidToUse(1);
        clickWebElement(earthLink);
        return this;
    }

    public NasaPage clickImageryLink() {
        avoidToUse(1);
        clickWebElement(imageryLink);
        return this;
    }

    public boolean compareText() {
        String val = getApiElement.getText();
        val = val.replace("GET", "").trim();
        return ( val.equals(PropertyAccesor.getInstance().getURlToCompare()) );
    }
}
