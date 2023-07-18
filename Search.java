package TestNGProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Search {
	
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
	    public void testSearchItem() {
	        String itemToSearch = "your_item_to_search";

	        // Find the search input field and type the item to search
	        driver.findElement(By.name("search")).sendKeys(itemToSearch);

	        // Click on the search button (if available)
	        driver.findElement(By.xpath("//button[text()='Search']")).click();

	        // Wait for search results (you may need to use explicit waits here)

	        // Add assertions to verify the search results
	        // For example, you can check if the search results page contains relevant information about the item you searched for.
	        // If the search results are as expected, the test will pass; otherwise, it will fail.
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the WebDriver instance after each test
	        driver.quit();
	    }
	}

}
