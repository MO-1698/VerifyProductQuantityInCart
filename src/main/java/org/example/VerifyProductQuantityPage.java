package org.example;
import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class VerifyProductQuantityPage {
    private SHAFT.GUI.WebDriver driver;

    public VerifyProductQuantityPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    private By HomePage = By.xpath("//a[@style=\"color: orange;\"]");
    private By ProductButton = By.xpath("//a[@href=\"/products\"]//i[@class=\"material-icons card_travel\"]");
    private By ViewProductButton = By.xpath("//a[@href=\"/product_details/1\"]");
    private By WriteYourReview = By.xpath("//a[@href=\"#reviews\"]");
    private By QuantityField = By.xpath("//input[@id='quantity']");
    private By AddToCartButton = By.xpath("//button[@class=\"btn btn-default cart\"]");
    private By ViewCartButton = By.xpath("//a[@href=\"/view_cart\"]//u");
    private By ProductInCart = By.xpath("//a[@href=\"/product_details/1\"]");
    private By ProductQuantity = By.xpath("//tr[@id=\"product-1\"]//button[@class=\"disabled\"]");

    public VerifyProductQuantityPage navigateToURL(String URL) {
        driver.browser().navigateToURL(URL);
        return this;
    }

    public VerifyProductQuantityPage clickOnProductButton() {
        driver.element().click(ProductButton);
        return this;
    }

    public VerifyProductQuantityPage clickOnViewProductButton() {
        driver.element().click(ViewProductButton);
        return this;
    }


    public VerifyProductQuantityPage clickOnAddToCartButton() {
        driver.element().click(AddToCartButton);
        return this;
    }

    public VerifyProductQuantityPage clickOnViewCartButton() {
        driver.element().click(ViewCartButton);
        return this;
    }


    @Step("Validate that the user is on Home Page")
    public VerifyProductQuantityPage ValidateHomePage() {
        driver.element().verifyThat(HomePage).text().contains("Home");
        return this;
    }

    @Step("Validate that the user in product details page")
    public VerifyProductQuantityPage ValidateWriteYourReview() {
        driver.element().verifyThat(WriteYourReview).text().contains("Write Your Review");
        return this;
    }

    @Step("Set quantity field to 4 items")
    public VerifyProductQuantityPage setQuantityFieldToFour() {
        driver.element().type(QuantityField, "4");
        return this;
    }

    @Step("Validate that the Product In Cart")
    public VerifyProductQuantityPage ValidateProductInCart() {
        driver.element().verifyThat(ProductInCart).text().contains("Blue Top");
        return this;
    }

    @Step("Validate that the Product Quantity in cart")
    public VerifyProductQuantityPage ValidateProductQuantity() {
        driver.element().verifyThat(ProductQuantity).text().contains("4");
        return this;
    }









}