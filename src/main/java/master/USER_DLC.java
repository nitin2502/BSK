package master;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class USER_DLC {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://trti.mahamining.com/login");
		driver.manage().window().maximize();
			
		//admin login
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
	   Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
	    Thread .sleep(1000);	
	    String s=JOptionPane.showInputDialog("enter your captcha");
	    
		driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
	    Thread .sleep(1000);
	  
		driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
		Thread .sleep(1000);
		//click on user tab
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).click();
		Thread .sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/div/div/ul/li[4]/a")).click();
		Thread .sleep(2000); 
		//click on user field
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000); 	
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();
		Thread .sleep(1000); 	
		
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a/span")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
		Thread .sleep(1000);	
		//fill details
		driver.findElement(By.xpath("//input[@placeholder='Enter Full Name']")).sendKeys("Enterfullname");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9730020958");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abcd2506@gmail.com");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//input[@placeholder='Enter User Name']")).sendKeys("Saurbhmasg");
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[1]/div/div[9]/div/div/button")).click();
		Thread .sleep(1000);	
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Address']")).sendKeys("abcdgh ,415,dsp road pune");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(3000);
		driver.navigate().refresh();
		//update record
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[6]/div/button[1]/i")).click();
		Thread .sleep(1000);
	    //clear record
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).clear();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile No']")).sendKeys("9730020959");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).clear();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("xyxzcvv@gmail.com");
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(1000);
	
		//delete record
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-user-register/div[1]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[6]/div/button[2]/i")).click();
		Thread .sleep(1000);
		// takes screenshot
		//only mobNo change user register from can accept all details
		 File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(scr, new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Screenshot\\UserDLC02.png"));
		// browser close
			 Thread .sleep(3000);
		  driver.close();    
	}

}
