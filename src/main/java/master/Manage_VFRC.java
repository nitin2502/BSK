package master;

import java.io.File;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Manage_VFRC {

	public static void main(String[] args) throws Exception 
	{System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://trti.mahamining.com/login");
	driver.manage().window().maximize();
	//Admin login
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
   Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
    Thread .sleep(1000);	
    String s=JOptionPane.showInputDialog("enter your captcha");
    
  	driver.findElement(By.xpath("//input[@placeholder='Enter Captcha']")).sendKeys(s);
      Thread .sleep(1000);
    
  	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
  	Thread .sleep(1000);
	//click on Manage VFRC tab
	driver.findElement(By.xpath("/html/body/app-root/app-layout/div/app-sidebar/nav/app-admin-menu/div/div[2]/h2/button")).click();
	Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[3]/a")).click();
	Thread .sleep(1000);
	//select divisin
	driver.findElement(By.xpath("//ngx-select[@placeholder='Select Division']")).click();
	Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-manage-vfrc/div/div/div/div/div[1]/div/app-shared-manage-vfrc/form/div[1]/div[1]/div/div/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	Thread .sleep(1000);
	//select district
	driver.findElement(By.xpath("//ngx-select[@placeholder='Select District']")).click();
	Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-manage-vfrc/div/div/div/div/div[1]/div/app-shared-manage-vfrc/form/div[1]/div[1]/div/div/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	Thread .sleep(1000);
	//select sdo
	driver.findElement(By.xpath("//ngx-select[@placeholder='Select Subdivision']")).click();
	Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-manage-vfrc/div/div/div/div/div[1]/div/app-shared-manage-vfrc/form/div[1]/div[1]/div/div/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
	Thread .sleep(1000);
	//select taluka
	driver.findElement(By.xpath("//ngx-select[@placeholder='Select Taluka']")).click();
	Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-manage-vfrc/div/div/div/div/div[1]/div/app-shared-manage-vfrc/form/div[1]/div[1]/div/div/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
	Thread .sleep(1000);
	//select vfrc
		driver.findElement(By.xpath("//ngx-select[@placeholder='Select VFRC']")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-manage-vfrc/div/div/div/div/div[1]/div/app-shared-manage-vfrc/form/div[1]/div[1]/div/div/div[6]/ngx-select/div/ngx-select-choices/ul/li/a/span")).click();
		Thread .sleep(1000);
		//select vfrc
				driver.findElement(By.xpath("//*[@id=\"content\"]/app-manage-vfrc/div/div/div/div/div[1]/div/app-shared-manage-vfrc/form/div[2]/div/button[2]")).click();
				Thread .sleep(1000);
	//takes screen shot
	Thread .sleep(2000);
	 File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scr, new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Screenshot\\Manage_VFRC01.png"));
	
	Thread .sleep(3000);
	  driver.close();
	}
}

