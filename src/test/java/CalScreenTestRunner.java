import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalScreenTestRunner extends Setup {

    @Test(priority = 1, description = "Do Sum")
    public void doSeries(){
        CalScreen calcScreen = new CalScreen(driver);
        String value = calcScreen.calculateSeries("100/10*5-10+60");
        System.out.println(value);
        Assert.assertEquals(value,"100");

        Allure.description("Calculate the Entire Series.");
    }
}

