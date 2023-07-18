package TestNGProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class AddProduct {
	
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
	    public void testAddProduct() {
	        // Navigate to the product addition page
	        driver.findElement(By.linkText("Add Product")).click();

	        // Fill in the product details in the form
	        WebElement nameInput = driver.findElement(By.name("name"));
	        WebElement priceInput = driver.findElement(By.name("price"));
	        WebElement descriptionInput = driver.findElement(By.name("description"));

	        String productName = "Product X";
	        String productPrice = "100.00";
	        String productDescription = "This is a sample product.";

	        nameInput.sendKeys(productName);
	        priceInput.sendKeys(productPrice);
	        descriptionInput.sendKeys(productDescription);

	        // Submit the form
	        driver.findElement(By.cssSelector(".submit-button")).click();

	        // Wait for a success message or confirmation that the product was added
	        // You may need to use explicit waits here

	        // Add assertions to verify that the product was successfully added
	        // For example, you can check if the product is now listed on the product list page or check for a success message.
	        // If the product is added as expected, the test will pass; otherwise, it will fail.
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the WebDriver instance after each test
	        driver.quit();
	    }
	}

}
