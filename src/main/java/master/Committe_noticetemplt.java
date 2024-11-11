package master;
import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Committe_noticetemplt {

	public static void main(String[] args) throws InterruptedException, IOException 
	{System.setProperty("webdriver.http.factory", "jdk-http-client");
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver= new FirefoxDriver();
	driver.get("http://trti.mahamining.com/login");
	driver.manage().window().maximize();
	Thread .sleep(1000);
	//Admin login
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
	Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
	Thread .sleep(1000);	
	String s=JOptionPane.showInputDialog("enter your captcha");

	driver.findElement(By.xpath("//input[@placeholder='कॅप्चा प्रविष्ट करा']")).sendKeys(s);
	Thread .sleep(1000);

	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
	Thread .sleep(1000);

	//Selection of master
	driver.findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
	Thread .sleep(1000);

	//Click on committee notice template

	driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[6]/a")).click();
	Thread .sleep(1000);  

	//enter data in committee notice field
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-committee-notice-template/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000);    
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-create-committee-notice-template/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	Thread .sleep(1000);  

	// Select Claim type 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-create-committee-notice-template/div[1]/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div")).click();
	Thread .sleep(1000);    
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-create-committee-notice-template/div[1]/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[1]/a/span")).click();
	Thread .sleep(1000);  

	//Select claim category 
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-create-committee-notice-template/div[1]/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000);       	
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-create-committee-notice-template/div[1]/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	Thread .sleep(1000);  

	// enter template title
	driver.findElement(By.xpath("//input[@placeholder='टेम्पलेट शीर्षक (मराठी)']")).sendKeys("आढावा बैठकीबाबत सूचना.");
	Thread .sleep(1000);    	
	driver.findElement(By.xpath("//textarea[@placeholder='वर्णन प्रविष्ट करा (मराठी)']")).sendKeys("सामूहिक वनहक्क दाव्याच्या पुनःपडताळणी सुचनेबाबत");
	Thread .sleep(1000);   
    // click on submit button
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread .sleep(3000);
	//click on edit button
	driver.findElement(By.xpath("//button[@class='btn text-main bg-light-main rounded']")).click();
	Thread .sleep(3000); 		

	driver.findElement(By.xpath("//input[@placeholder='टेम्पलेट शीर्षक (मराठी)']")).clear();
	Thread .sleep(1000);    	
	driver.findElement(By.xpath("//input[@placeholder='टेम्पलेट शीर्षक (मराठी)']")).sendKeys("बैठकीबाबत सूचना");
	Thread .sleep(1000);   


	//click on update button
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-create-committee-notice-template/div[1]/div/div/div/div[1]/form/div/div/div[2]/div/div[2]/button")).click();
	//click on delete button
	driver.findElement(By.xpath("//button[class='btn text-danger bg-light-danger rounded']")).click();
	String alertMessage = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	System.out.println(alertMessage);;
	Thread .sleep(3000);


	// take screenshot
	Thread .sleep(3000); 	
	File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(scr, new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Screenshot\\Committee01.png"));
	//Close the browser
	Thread .sleep(3000);
	driver.close();	

	}

}
