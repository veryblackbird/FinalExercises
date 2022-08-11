package Exercise1;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;


public class AddressPage {

    private  WebDriver driver;

    public AddressPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"addresses-link\"]/span/i")
    WebElement userAddresses;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/a/span")
    WebElement userNewAddress;

    @FindBy(name = "alias")
    WebElement userNewAlias;

    @FindBy(name = "address1")
    WebElement userNewAddress1;

    @FindBy(name = "city")
    WebElement userNewCity;

    @FindBy(name = "postcode")
    WebElement userNewPostcode;

    @FindBy(name = "phone")
    WebElement userNewPhone;

    @FindBy(xpath = "//button[contains(text(),'Save')]")
    WebElement submitNewAddress;

    public void addresses(){
        userAddresses.click();
    }

    public void newAddress(){
        userNewAddress.click();
    }

    public  void newAlias(String alias){
        userNewAlias.sendKeys(alias);
    }

    public void newAddress1(String address){
        userNewAddress1.sendKeys(address);
    }

    public void newCity(String city){
        userNewCity.sendKeys(city);
    }

    public void newPostcode(String postcode){
        userNewPostcode.sendKeys(postcode);
    }

    public void setUserNewPhone(String phone){
        userNewPhone.sendKeys(phone);
    }

    public void saveNewAddress(){
        submitNewAddress.click();
    }

}
