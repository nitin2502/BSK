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

public class CasteN {
	public static void main(String[] args) throws InterruptedException, IOException    {
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.firefoxdriver().setup();
	    WebDriver driver= new FirefoxDriver();
	    driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
		
		//admin login
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
	    Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
	    Thread .sleep(1000);
	    //click on login button
	    String s=JOptionPane.showInputDialog("enter your captcha");
	    
		driver.findElement(By.xpath("//input[@placeholder='कॅप्चा प्रविष्ट करा']")).sendKeys(s);
	    Thread .sleep(1000);
	  
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
		Thread .sleep(1000);
		//master selection
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).getText();
		Thread .sleep(1000);
		// caste selection
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/div/div/ul/li[5]/a")).click();
		Thread .sleep(1000);
		// cast category selection
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-caste/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-caste/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[4]/a/span")).click();
		Thread .sleep(1000);
		// Enter caste name
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-caste/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/input")).sendKeys("Koli");
		Thread .sleep(1000);
		//click on submit button
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-caste/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(3000); 
		//click on edit button
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-caste/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/button[1]/i")).click();
		Thread .sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='जातीचे नाव टाका']")).clear();
		Thread .sleep(2000); 
		//enter updated caste name
		driver.findElement(By.xpath("//input[@placeholder='जातीचे नाव टाका']")).sendKeys("Agari");
		Thread .sleep(2000); 
		//click on update
		driver.findElement(By.xpath("//button[@class='btn text-main bg-light-main rounded me-2']")).click();
		Thread .sleep(2000);
		//click on delete
		driver.findElement(By.xpath("//button[@class='btn text-danger bg-light-danger rounded ms-1']")).click();
		Thread .sleep(2000);
		driver.switchTo().alert().accept();
		//takes screenshot
		Thread .sleep(2000);  
		File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scr, new File("Z:\\Scrnshot\\Caste02.png"));
         // close the browser
		 Thread .sleep(3000);
		  driver.close();
	}
}