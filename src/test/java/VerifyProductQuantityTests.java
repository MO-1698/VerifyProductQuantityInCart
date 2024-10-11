import com.shaft.driver.SHAFT;
import jdk.jfr.Description;
import org.example.VerifyProductQuantityPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyProductQuantityTests {
    private SHAFT.GUI.WebDriver driver;

    @BeforeMethod
    @Description("this is a setup class for our test")
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
    }

    @Test(description = "Validate product is in cart with specific quantity")
    private void validateVerifyProductQuantity() {
        new VerifyProductQuantityPage(driver).navigateToURL("https://automationexercise.com/")
                .ValidateHomePage().clickOnProductButton().clickOnViewProductButton()
                .ValidateWriteYourReview().setQuantityFieldToFour().clickOnAddToCartButton()
                .clickOnViewCartButton().ValidateProductInCart().ValidateProductQuantity();
    }
}
