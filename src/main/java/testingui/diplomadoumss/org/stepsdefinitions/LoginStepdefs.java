package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import testingui.diplomadoumss.org.manageloadpage.LoadPage;
import testingui.diplomadoumss.org.managepage.coupons.Coupons;
import testingui.diplomadoumss.org.managepage.dashboard.Dashboard;
import testingui.diplomadoumss.org.managepage.login.Login;

/**
 * @author Marcelo Garay
 * @project testingui.diplomadoumss.org
 */
public class LoginStepdefs {
    private Login login;
    private Dashboard dashboard;
    private Coupons coupons;

    @Given("^I load PHP travels$")
    public void iLoadPHPTravels() throws Throwable {
        login = LoadPage.loadPPHPTravels();
    }

    @And("^set my credencials  on 'Login' page$")
    public void setMyCredencialsOnLoginPage() throws Throwable {
        dashboard = login.setCredentials();
    }

    @And("^click 'Cars' link on 'Left Panel' page$")
    public void clickCarsLinkOnLeftPanelPage() throws Throwable {
        dashboard.clickCarsExpand();
    }

    @And("^click 'Coupons' link on 'Left Panel' page$")
    public void clickCouponsLinkOnLeftPanelPage() {
        coupons = dashboard.clickCouponsExpand();
    }

    @And("^click 'Add' link on 'Coupons' page$")
    public void clickAddLinkOnCouponsPage() {
        coupons.clickAddButton();
    }

    @And("^set fields on 'Add Coupon Modal ' on 'Coupons page'$")
    public void setFieldsOnAddCouponModalOnCouponsPage() {
        coupons.setAddCouponFields();
    }
}
