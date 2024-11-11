package master;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Panchayat {
	public static void main(String[] args) throws InterruptedException, IOException 
	{	System.setProperty("webdriver.chrome.driver","C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Driver\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://trti.mahamining.com/login");
	driver.manage().window().maximize();

	Thread .sleep(1000);	
	//admin login
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("admin");
     Thread .sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[2]/div/div/input")).sendKeys("admin");
     Thread .sleep(1000);	
     String s=JOptionPane.showInputDialog("कॅप्चा प्रविष्ट करा");
     
 	driver.findElement(By.xpath("//input[@placeholder='कॅप्चा प्रविष्ट करा']")).sendKeys(s);
     Thread .sleep(1000);
   
 	driver.findElement(By.xpath("//*[@id=\"login\"]/div/div/div[2]/form/div/div[5]/button")).click();
 	Thread .sleep(3000);
   //click on master
	driver.findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
	Thread .sleep(1000);
  //click on panchayat
	driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[2]/a")).click();
	Thread .sleep(4000);
	//enter panchayat all field
	driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
	Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/ngx-select-choices/ul/li[6]/a/span")).click();	
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/ngx-select/div/ngx-select-choices/ul/li[5]/a/span")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[4]/div/ngx-select/div/div[2]/div")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[4]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a/span")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[5]/div/ngx-select/div/div[2]/div/span[1]/span")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[5]/div/ngx-select/div/ngx-select-choices/ul/li[3]/a")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[6]/div/ngx-select/div/input")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[6]/div/ngx-select/div/ngx-select-choices/ul/li[7]/a")).click();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//input[@placeholder='ग्रामपंचायत/पालिकेचे नाव टाका']")).sendKeys("Testgrampanchayat");
    Thread .sleep(1000);
    // click on submit button
    driver.findElement(By.xpath("//button[@class='btn btn-main'][1]")).click();
    Thread .sleep(3000);
    driver.navigate().refresh();
  
   // search fld
    driver.findElement(By.xpath("//input[@placeholder='पंचायत/पालिकेचे नाव टाका        ']")).sendKeys("Testgrampanchayat");
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[2]/div/div[1]/form/div/div/div[6]/button/i")).click();
    Thread .sleep(2000);
    
    // update record
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[7]/button[1]/i")).click();
    Thread .sleep(1000);
    //update record
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[7]/div/input")).clear();
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[7]/div/input")).sendKeys("Edittest");
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
    Thread .sleep(1000);
    driver.navigate().refresh();
    Thread .sleep(3000);
    // search fld
    driver.findElement(By.xpath("//input[@placeholder='पंचायत/पालिकेचे नाव टाका        ']")).sendKeys("Testgrampanchayat");
    Thread .sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[2]/div/div[1]/form/div/div/div[6]/button/i")).click();
    Thread .sleep(3000);
    //delete record
    //driver.findElement(By.xpath("//*[@id=\"content\"]/app-panchayat/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[7]/button[2]")).click();
    //Thread .sleep(1000);
    driver.switchTo().alert().accept();
    Thread .sleep(1000);
	//driver.close();
	/* Select drpdn=new Select(driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-panchayat/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/ngx-select/div/div[2]/div/span[1]/span"))); 
	List <WebElement> options=drpdn.getOptions();
      System.out.println(options.size());
     for (WebElement e: options)
     {
    	 System.out.println("The values are"+e.getText());
     }*/
//take screenshot
File  scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(scr, new File("C:\\Users\\niting\\eclipse-workspace\\Aadivanmitras\\Screenshot\\Panchayat001.png"));
	
	//close browser
	Thread .sleep(3000);
  driver.close();	
	
	
	
	

	
	}

}
