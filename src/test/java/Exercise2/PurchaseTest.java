package Exercise2;

    import io.cucumber.junit.Cucumber;
    import io.cucumber.junit.CucumberOptions;
    import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/cucumber/features/purchase.feature",
plugin = {"pretty", "html:report/result.html"})

public class PurchaseTest {
}
