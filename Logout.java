package TestNGProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Logout {
	
	    private WebDriver driver;
	    private String baseUrl = "https://www.example-ecommerce.com";

	    @BeforeMethod
	    public void setUp() {
	        // Set up the WebDriver instance (e.g., ChromeDriver)
	        System.setProperty("C:\Users\DELL\Downloads\chromedriver_win32//chromedriver.exe\");;
	        driver = new ChromeDriver();
	        driver.get(baseUrl);

	        // Perform login before testing the logout functionality
	        performLogin();
	    }

	    @Test
	    public void testLogout() {
	        // Find the logout button/link and click on it
	        WebElement logoutButton = driver.findElement(By.cssSelector(".logout-button"));
	        logoutButton.click();

	        // Wait for a success message or confirmation that the logout was successful
	        // You may need to use explicit waits here

	        // Add assertions to verify that the logout was successful
	        // For example, you can check if the login page is displayed after logging out or check for a success message indicating successful logout.
	        // If the logout is successful, the test will pass; otherwise, it will fail.
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the WebDriver instance after each test
	        driver.quit();
	    }

	    private void performLogin() {
	        // Find the login elements and perform the login action
	        driver.findElement(By.name("username")).sendKeys("your_username");
	        driver.findElement(By.name("password")).sendKeys("your_password");
	        driver.findElement(By.cssSelector(".login-button")).click();

	        // Wait for the login to complete (you may need to use explicit waits here)
	    }
	}

}
