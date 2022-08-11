package Exercise1;

    import io.cucumber.junit.Cucumber;
    import io.cucumber.junit.CucumberOptions;
    import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/cucumber/features/address.feature",
        plugin ={"pretty", "html:report/result.html"} )
public class NewAddressTest {

}
