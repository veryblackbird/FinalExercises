package Exercise2;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;


public class MyAccountPage {

    private  WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/input[2]")
    WebElement userWriteInSearchCatalog;

    @FindBy(xpath = "//*[@id=\"search_widget\"]/form/button")
    WebElement userSearchCatalog;

    public void searchCatalog(String product) {

        userWriteInSearchCatalog.click();
        userWriteInSearchCatalog.sendKeys(product);
        userSearchCatalog.click();
    }


}
