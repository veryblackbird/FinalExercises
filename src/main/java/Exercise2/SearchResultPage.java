package Exercise2;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;


public class SearchResultPage {

    private  WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"js-product-list\"]/div[1]/article/div/a")
    WebElement userOpenProductPage;

    public void clickProductPage(){
        userOpenProductPage.click();
    }
}
