package TestNGProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Update {
	
	    private WebDriver driver;
	    private String baseUrl = "https://www.example-ecommerce.com";

	    @BeforeMethod
	    public void setUp() {
	        // Set up the WebDriver instance (e.g., ChromeDriver)
	        System.setProperty("C:\Users\DELL\Downloads\chromedriver_win32//chromedriver.exe\");
	        driver = new ChromeDriver();
	        driver.get(baseUrl);
	    }

	    @Test
	    public void testUpdateProduct() {
	        // Navigate to the product update page for a specific product
	        String productId = "product_id_to_update";
	        driver.get(baseUrl + "/products/" + productId + "/edit");

	        // Modify the product details in the form
	        WebElement nameInput = driver.findElement(By.name("name"));
	        WebElement priceInput = driver.findElement(By.name("price"));
	        WebElement descriptionInput = driver.findElement(By.name("description"));

	        String updatedProductName = "Updated Product X";
	        String updatedProductPrice = "150.00";
	        String updatedProductDescription = "This is the updated version of the product.";

	        nameInput.clear();
	        nameInput.sendKeys(updatedProductName);

	        priceInput.clear();
	        priceInput.sendKeys(updatedProductPrice);

	        descriptionInput.clear();
	        descriptionInput.sendKeys(updatedProductDescription);

	        // Submit the form
	        driver.findElement(By.cssSelector(".submit-button")).click();

	        // Wait for a success message or confirmation that the product was updated
	        // You may need to use explicit waits here

	        // Add assertions to verify that the product was successfully updated
	        // For example, you can check if the updated product details are displayed correctly on the product details page or check for a success message.
	        // If the product is updated as expected, the test will pass; otherwise, it will fail.
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the WebDriver instance after each test
	        driver.quit();
	    }
	}
