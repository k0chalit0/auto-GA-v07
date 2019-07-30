package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.nasa.NasaPage;

import static org.testng.Assert.assertEquals;


public class NasaStepDefs {

    NasaPage nasa;

    @Given("^I load Nasa Page$")
    public void iLoadNasaPage() {
        nasa = LoadPage.loadNasaPage();
    }

    @And("^click 'NasaApiListing' link on 'Left Panel' page$")
    public void clickNasaApiListingLinkOnLeftPanelPage() {
        nasa = nasa.clickNasaApiListing();
    }

    @And("^reClick 'NasaApiListing' link on 'Left Panel' page$")
    public void reclickNasaApiListingLinkOnLeftPanelPage() {
        nasa = nasa.reclickNasaApiListing();
    }

    @And("^click 'Earth' link on 'Left Panel' page$")
    public void clickEarthLinkOnLeftPanelPage() {
        nasa = nasa.clickEarthLink();
    }

    @And("^click 'Imagering' sublink on 'LeftPanel' page$")
    public void clickImagerSublinkOnLeftPanelPage() {
        nasa = nasa.clickImageryLink();
    }

    @Then("^verify the 'GETUrl' isEquals to 'urlGetText' in page$")
    public void verifyTheGETUrlIsEqualsToUrlGetTextInPage() {
        assertEquals(nasa.compareText(), true);
    }
}
