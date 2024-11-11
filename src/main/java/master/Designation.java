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

public class Designation {

	public static void main(String[] args) throws InterruptedException, IOException
	{

		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver= new FirefoxDriver();
	    driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
		//Admin login
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
	   Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
	    Thread .sleep(1000);	
	    String s=JOptionPane.showInputDialog("Captcha");
	    
		driver.findElement(By.xpath("//input[@placeholder='कॅप्चा प्रविष्ट करा']")).sendKeys(s);
	    Thread .sleep(1000);
	  
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
		Thread .sleep(1000);
		//Selection of master
		driver.findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
		Thread .sleep(1000);
		
		//selection of designation
		driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[1]/a")).click();
		Thread .sleep(1000);
		
		
		
		//select commiti level
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-designation/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-designation/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
		Thread .sleep(1000);  
		//Enter designation name
		driver.findElement(By.xpath("//input[@placeholder='पदनाम']")).sendKeys("Sub Assistant");
		Thread .sleep(1000); 
		//Enter designation  name 
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[1]/form/div/div/div[1]/div[4]/div/input")).sendKeys("प्रविष्ट");
		Thread .sleep(3000); 
	
		//click on submit button6
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(3000);
		

		//click on edit button
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/button[1]/i")).click();
		Thread .sleep(2000); 
	
		driver.findElement(By.xpath("//input[@placeholder='पदनाम']")).clear();
		Thread .sleep(1000); 
		//enter updated data
		driver.findElement(By.xpath("//input[@placeholder='पदनाम']")).sendKeys("Collector");
		Thread .sleep(1000);
		//click on update button
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(1000); 
		//click on delete button
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-designation/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/button[2]/i")).click();
		Thread .sleep(2000);
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertMessage);
		String Exp="Are you sure you want to delete this record?";
				//take a screenshot
		Thread .sleep(2000); 
		 File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(scr, new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Screenshot\\designation001.png"));
		// close the browser
		Thread .sleep(3000);
		  driver.quit();
	}

}