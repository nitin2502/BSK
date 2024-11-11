package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBSk {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentTest test;

	@BeforeClass
	public void setup() {
		// Set up WebDriver
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demomybsk.hitechdairy.in/login");

		// Set up Extent Reports
		extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter("BSKlogin_Report.html");
		sparkReporter.config().setDocumentTitle("Login Test Automation Report");
		sparkReporter.config().setReportName("Login Feature Test Report");
		extentReports.attachReporter(sparkReporter);
	}

	@AfterClass
	public void tearDown() {
		// Quit WebDriver
		if (driver != null) {
			driver.quit();
		}

		// Flush the Extent Report
		extentReports.flush();
	}

	// Test Case: TC01 - Verify login with valid credentials
	@Test
	public void loginWithValidCredentials() throws InterruptedException {
		test = extentReports.createTest("TC01 - Verify login with valid credentials");
		test.log(Status.INFO, "Refreshing page and entering valid credentials.");

		driver.navigate().refresh();
		driver.findElement(By.id("mat-input-0")).sendKeys("admin@shauryatechnosoft.com"); 
		driver.findElement(By.id("mat-input-1")).sendKeys("Admin@1234"); 
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

		Thread.sleep(2000);

		try {
			Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login Successful");
			test.log(Status.PASS, "Login with valid credentials was successful.");
		} catch (AssertionError e) {
			test.log(Status.FAIL, "Login failed: " + e.getMessage());
			throw e;
		}
	}

	// Test Case: TC02 - Verify login with invalid credentials
	@Test
	public void loginWithInvalidCredentials() throws InterruptedException {
		test = extentReports.createTest("TC02 - Verify login with invalid credentials");
		test.log(Status.INFO, "Refreshing page and entering invalid credentials.");

		driver.navigate().refresh();
		driver.findElement(By.id("mat-input-0")).sendKeys("sarg");
		driver.findElement(By.id("mat-input-1")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

		Thread.sleep(2000);

		WebElement errorMessage = driver.findElement(By.xpath("//mat-error[@aria-live='polite']"));
		try {
			Assert.assertEquals(errorMessage.getText(), "Please enter valid email id");
			test.log(Status.PASS, "Error message displayed correctly for invalid credentials.");
		} catch (AssertionError e) {
			test.log(Status.FAIL, "Error message incorrect: " + e.getMessage());
			throw e;
		}
	}

	
	// Test Case: TC03 - Verify login with empty fields
	@Test
	public void loginWithEmptyFields() throws InterruptedException {
		test = extentReports.createTest("TC03 - Verify login with empty fields");
		test.log(Status.INFO, "Refreshing page and leaving fields empty.");

		driver.navigate().refresh();
		driver.findElement(By.id("mat-input-0")).clear();
		driver.findElement(By.id("mat-input-1")).clear();
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

		Thread.sleep(2000);

		WebElement emailField = driver.findElement(By.id("mat-input-0"));
		WebElement passwordField = driver.findElement(By.id("mat-input-1"));
		try {
			Assert.assertEquals(emailField.getCssValue("border-color"), "rgba(0, 0, 0, 0.87)", "Email field should have a red border.");
			Assert.assertEquals(passwordField.getCssValue("border-color"), "rgba(0, 0, 0, 0.87)", "Password field should have a red border.");
			test.log(Status.PASS, "Empty field validation passed.");
		} catch (AssertionError e) {
			test.log(Status.FAIL, "Empty field validation failed: " + e.getMessage());
			throw e;
		}
	}

	// Test Case: TC04 - Verify login with only email entered
	@Test
	public void loginWithOnlyEmailEntered() throws InterruptedException {
		test = extentReports.createTest("TC04 - Verify login with only email entered");
		test.log(Status.INFO, "Entering only email and leaving password empty.");

		driver.findElement(By.id("mat-input-0")).sendKeys("admin@shauryatechnosoft.com");
		driver.findElement(By.id("mat-input-1")).clear();
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();

		Thread.sleep(2000);

		WebElement passwordField = driver.findElement(By.id("mat-input-1"));
		try {
			Assert.assertEquals(passwordField.getCssValue("border-color"), "rgba(0, 0, 0, 0.87)", "Password field should have a red border.");
			test.log(Status.PASS, "Only email entered validation passed.");
		} catch (AssertionError e) {
			test.log(Status.FAIL, "Only email entered validation failed: " + e.getMessage());
			throw e;
		}
	}

	// Test Case: TC05 - Verify login with only password entered
	@Test
	public void loginWithOnlyPasswordEntered() throws InterruptedException {
		test = extentReports.createTest("TC05 - Verify login with only password entered");

		driver.findElement(By.id("mat-input-0")).clear();
		driver.findElement(By.id("mat-input-1")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		Thread.sleep(2000);

		WebElement emailField = driver.findElement(By.id("mat-input-0"));
		String emailBorderColor = emailField.getCssValue("border-color");

		test.log(Status.INFO, "Checking email field for red border indicating blank field error");
		Assert.assertEquals(emailBorderColor, "rgba(0, 0, 0, 0.87)", "Email field should have a red border.");
		test.pass("Email field has red border indicating blank field error.");
	}

	// Test Case: TC06 - Verify login with special characters
	@Test
	public void loginWithSpecialCharacters() throws InterruptedException {
		test = extentReports.createTest("TC06 - Verify login with special characters");

		driver.findElement(By.id("mat-input-0")).sendKeys("adm..i@");
		driver.findElement(By.id("mat-input-1")).sendKeys("!@#$%");
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		Thread.sleep(2000);

		WebElement errorMessage = driver.findElement(By.xpath("//mat-error[@aria-live='polite']"));
		test.log(Status.INFO, "Checking error message for invalid email format");
		Assert.assertEquals(errorMessage.getText(), "Please enter valid email id");
		test.pass("Proper error message displayed for invalid email format.");
	}

	// Test Case: TC07 - Verify "Login" button is clickable
	@Test
	public void loginButtonIsClickable() throws InterruptedException {
		test = extentReports.createTest("TC07 - Verify 'Login' button is clickable");

		driver.findElement(By.id("mat-input-0")).sendKeys("ganesh025gmail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("Admin@02458");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		Thread.sleep(2000);

		test.log(Status.INFO, "Checking if 'Login' button is clickable");
		Assert.assertTrue(loginButton.isEnabled(), "Login button should be clickable.");
		test.pass("'Login' button is clickable.");
	}

}
