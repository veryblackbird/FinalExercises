package Exercise2;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;


public class CheckOutPage2 {

    private WebDriver driver;

    public CheckOutPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "confirm-addresses")
    WebElement userConfirmAddress;

    @FindBy(name = "confirmDeliveryOption")
    WebElement userConfirmDeliveryOption;

    @FindBy(xpath = "//*[@id=\"payment-option-1\"]")
    WebElement userChoosePaymentOption;

    @FindBy(xpath = "//*[@id=\"conditions_to_approve[terms-and-conditions]\"]")
    WebElement userAgreeTerms;

    @FindBy(xpath = "//*[@id=\"payment-confirmation\"]/div[1]/button")
    WebElement userConfirmOrder;

    public void confirmAddress() { userConfirmAddress.click(); }
    public void confirmDelivery() { userConfirmDeliveryOption.click(); }
    public void paymentOption() { userChoosePaymentOption.click(); }
    public void agreeTerms() { userAgreeTerms.click(); }
    public void confirmOrder() { userConfirmOrder.click(); }
}
