package Exercise1;

    import LogIn.LogInPage;
    import io.cucumber.java.en.And;
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import org.assertj.core.api.Assertions;
    import org.junit.Assert;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import java.time.Duration;


public class NewAddressSteps {

    private WebDriver driver;

    private static final String EXPECTED_TEXT = "Address successfully added!";
    private static final String EXPECTED_ALIAS = "barack";
    private static final String EXPECTED_ADDRESS = "Street";
    private static final String EXPECTED_CITY = "London";
    private static final String EXPECTED_POSTCODE = "XX-123";
    private static final String EXPECTED_PHONE = "555444111";


    @Given("user is at home page")
    public void homePage() {

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
    }

    @And("^fills form with (.*) (.*) (.*) (.*) (.*)$")
    public void fillFormAddressPage(String alias, String address, String city, String postcode, String phone) {
        AddressPage addressPage = new AddressPage(driver);
        addressPage.addresses();
        addressPage.newAddress();
        addressPage.newAlias(alias);
        addressPage.newAddress1(address);
        addressPage.newCity(city);
        addressPage.newPostcode(postcode);
        addressPage.setUserNewPhone(phone);

        Assertions.assertThat(alias).isEqualTo(EXPECTED_ALIAS);
        Assertions.assertThat(address).isEqualTo(EXPECTED_ADDRESS);
        Assertions.assertThat(city).isEqualTo(EXPECTED_CITY);
        Assertions.assertThat(postcode).isEqualTo(EXPECTED_POSTCODE);
        Assertions.assertThat(phone).isEqualTo(EXPECTED_PHONE);
    }

    @And("clicks on Save")
    public void saveNewAddress() {
        AddressPage addressPage = new AddressPage(driver);
        addressPage.saveNewAddress();
    }

    @Then("new address is created with success message - Address successfully added!")
    public void successMessageExpected() {
        AddressResultPage addressResultPage = new AddressResultPage(driver);
        Assertions.assertThat(addressResultPage.getMessage()).isEqualTo(EXPECTED_TEXT);
    }

    @And("closes browser")
    public void tearDown(){driver.close();}
}
