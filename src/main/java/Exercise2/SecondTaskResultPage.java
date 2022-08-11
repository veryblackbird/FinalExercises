package Exercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecondTaskResultPage {

    private WebDriver driver;

    public SecondTaskResultPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSecondTaskResultText(){
        return driver.findElement(By.name("xxx")).getText();
    }



}
