package Exercise1;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;


public class AddressResultPage {

    private WebDriver driver;

    public AddressResultPage(WebDriver driver){
        this.driver = driver;
    }

    public String getMessage() {
        return driver.findElement(By.xpath("//*[@id=\"notifications\"]/div/article/ul/li")).getText();
    }

}
