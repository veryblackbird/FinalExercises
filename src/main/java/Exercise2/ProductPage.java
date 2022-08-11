package Exercise2;

    import org.openqa.selenium.Keys;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;


public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="group_1")
    WebElement userChooseSize;

   @FindBy(name="qty")
    WebElement userChooseQuantity;

    @FindBy(xpath = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button")
    WebElement userAddSweater;

    @FindBy(xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    WebElement userToCheckout;

    public void chooseSize(String size) {

        userChooseSize.click();
        userChooseSize.sendKeys(size);
        userChooseSize.click();
    }

    public void chooseQuantity(String quantity) {

        userChooseQuantity.click();
        userChooseQuantity.sendKeys(Keys.BACK_SPACE);
        userChooseQuantity.sendKeys(quantity);
    }

    public void addSweater(){
        userAddSweater.click();
    }

    public void toCheckout(){
        userToCheckout.click();
    }

}
