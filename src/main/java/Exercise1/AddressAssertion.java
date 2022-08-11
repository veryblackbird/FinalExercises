package Exercise1;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;


public class AddressAssertion {

    private WebDriver driver;

    public AddressAssertion(WebDriver driver){
        this.driver = driver;
    }

    public String getNewAlias() {
        return driver.findElement(By.name("alias")).getText();
    }

}
