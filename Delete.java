package TestNGProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Delete {
	
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
	    public void testDeleteProduct() {
	        // Navigate to the product deletion page for a specific product
	        String productId = "product_id_to_delete";
	        driver.get(baseUrl + "/products/" + productId + "/delete");

	        // Find the delete button and click on it to confirm the deletion
	        WebElement deleteButton = driver.findElement(By.cssSelector(".delete-button"));
	        deleteButton.click();

	        // Wait for a success message or confirmation that the product was deleted
	        // You may need to use explicit waits here

	        // Add assertions to verify that the product was successfully deleted
	        // For example, you can check if the product is no longer listed on the product list page or check for a success message indicating successful deletion.
	        // If the product is deleted as expected, the test will pass; otherwise, it will fail.
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the WebDriver instance after each test
	        driver.quit();
	    }
	}

}
