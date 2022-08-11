package Exercise2;

    import LogIn.LogInPage;
    import io.cucumber.java.en.And;
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import org.openqa.selenium.OutputType;
    import org.openqa.selenium.TakesScreenshot;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.apache.commons.io.FileUtils;
    import java.io.File;
    import java.io.IOException;
    import java.time.Duration;


public class PurchaseSteps {

    private WebDriver driver;

    @Given("user is at home page")
    public void setUp() {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/");
    }

    @When("registered user logins to account with {word}, {word}")
    public void startLogIn(String email, String password) {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.logIn();
        logInPage.enterEmail(email);
        logInPage.enterPassword(password);
        logInPage.submitLogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @And ("searches catalog with {word}")
    public void searchSweater(String product) {
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.searchCatalog(product);
    }

    @And ("opens sweater product page")
    public void openProductPage() {
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        searchResultPage.clickProductPage();
    }

    @And("chooses size {word}")
    public void chooseRightSweater(String size){
        ProductPage productPage = new ProductPage(driver);
        productPage.chooseSize(size);
    }

    @And("chooses quantity {word}, adds to chart and checks out")
    public void chooseRightQuantity(String quantity){
        ProductPage productPage = new ProductPage(driver);
        productPage.chooseQuantity(quantity);
        productPage.addSweater();
        productPage.toCheckout();
    }

    @And("proceeds to checkout 2")
    public void openCheckOut2 () {
        CheckOutPage checkoutPage = new CheckOutPage(driver);
        checkoutPage.toCheckout2();
    }

    @And("confirms address, chooses delivery and payment and agrees to terms")
    public void proceedCheckOut2(){
        CheckOutPage2 checkOutPage2 = new CheckOutPage2(driver);
        checkOutPage2.confirmAddress();
        checkOutPage2.confirmDelivery();
        checkOutPage2.paymentOption();
        checkOutPage2.agreeTerms();
        checkOutPage2.confirmOrder();
    }

    @Then("takes a screenshot")
    public void takeScreenshot(){
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(SrcFile , new File("report/screenshot.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @And("closes browser")
    public void tearDown() {
        driver.close();
    }
}


