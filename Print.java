package TestNGProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
public class Print {
	
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
	    public void testPrintProductList() {
	        // Find all product elements on the first page
	        List<WebElement> productElements = driver.findElements(By.cssSelector(".product"));

	        // Print the product names and prices
	        for (WebElement productElement : productElements) {
	            WebElement nameElement = productElement.findElement(By.cssSelector(".product-name"));
	            WebElement priceElement = productElement.findElement(By.cssSelector(".product-price"));
	            
	            String productName = nameElement.getText();
	            String productPrice = priceElement.getText();
	            
	            System.out.println("Product: " + productName + " - Price: " + productPrice);
	        }
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the WebDriver instance after each test
	        driver.quit();
	    }
	}

}
