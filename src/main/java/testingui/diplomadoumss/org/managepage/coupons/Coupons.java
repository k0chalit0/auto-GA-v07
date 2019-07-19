package testingui.diplomadoumss.org.managepage.coupons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testingui.diplomadoumss.org.managepage.BasePage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import static testingui.diplomadoumss.org.manageevents.Event.*;

public class Coupons extends BasePage {

    @FindBy(xpath = "//button[@type='button' and @data-target='#ADD_COUPON']")
    private WebElement addButton;

    @FindBy(id = "rate")
    private WebElement percentageField;

    @FindBy(id = "max")
    private WebElement maxUsesField;

    @FindBy(id = "stardate")
    private WebElement startDateField;

    @FindBy(id = "expdate")
    private WebElement expiretDateField;

    public Coupons() {
//        isWebElementVisible(bookingLink);
        avoidToUse(3);
    }

    public Coupons clickAddButton() {
        clickWebElement(addButton);
        System.out.println("test test test");
        return this;
    }

    public Coupons setAddCouponFields(){
        avoidToUse(2);
        Random ran = new Random();
        int percentage = ran.nextInt(99) + 1;
        int maxuses = ran.nextInt(10) + 1;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        Calendar d = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, maxuses);
        d.setTime(c.getTime());
        d.add(Calendar.DATE, 1);
        String dateString = format.format(c.getTime());
        String dateString2 = format.format(d.getTime());
        fillWebElement(percentageField, percentage+"");
        fillWebElement(maxUsesField, maxuses+"");
        fillWebElement(startDateField, dateString);
        clickWebElement(startDateField);
        fillWebElement(expiretDateField, dateString2);
        clickWebElement(expiretDateField);
        return this;
    }
}
