package TestNGProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class LoginPage {
	
	    private WebDriver driver;
	    private LoginPage loginPage;

	    @BeforeMethod
	    public void setUp() {
	        // Set up the WebDriver instance (e.g., ChromeDriver)
	        System.setProperty("C:\Users\DELL\Downloads\chromedriver_win32//chromedriver.exe\");
	        driver = new ChromeDriver();
	        driver.get("https://www.flipkart.com/account/login?ret=/"); // Replace with your login page URL
	        loginPage = new LoginPage();
	    }

	    @Test
	    public void testValidLogin() {
	        loginPage.enterUsername("your_username");
	        loginPage.enterPassword("your_password");
	        loginPage.clickLogin();
	        // Add assertions to verify successful login
	    }

	    private void clickLogin() {
			// TODO Auto-generated method stub
			
		}

		private void enterPassword(String string) {
			// TODO Auto-generated method stub
			
		}

		private void enterUsername(String string) {
			// TODO Auto-generated method stub
			
		}

		@Test
	    public void testInvalidLogin() {
	        loginPage.enterUsername("valid_username");
	        loginPage.enterPassword("valid_password");
	        loginPage.clickLogin();
	        // Add assertions to verify login failure
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close the WebDriver instance after each test
	        driver.quit();
	    }
	}


