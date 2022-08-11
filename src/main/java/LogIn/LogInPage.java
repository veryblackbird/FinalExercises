package LogIn;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;


public class LogInPage {

    private WebDriver driver;

    public LogInPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id=\"_desktop_user_info\"]/div/a/span")
    WebElement userLogIn;

    @FindBy(name = "email")
    WebElement userEmail;

    @FindBy(name = "password")
    WebElement userPassword;

    @FindBy(id="submit-login")
    WebElement userSubmitLogin;

    public void logIn(){
        userLogIn.click();
    }

    public void enterEmail(String email){
        userEmail.sendKeys(email);
    }

    public void enterPassword(String password){
        userPassword.sendKeys(password);
    }

    public void submitLogin(){
        userSubmitLogin.click();
    }
}
