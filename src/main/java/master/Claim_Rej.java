package master;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Claim_Rej {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
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
		// master selection
		driver.findElement(By.xpath("//*[@id=\"heading1\"]/button/div/div[2]")).click();
		Thread .sleep(1000);
		// claim rej sel
		driver.findElement(By.xpath("//*[@id=\"collapse1\"]/div/ul/li[7]/a")).click();
		Thread .sleep(1000);   
		//click on select commit
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/div[2]/div")).click();
		Thread .sleep(1000);  
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[1]/div/ngx-select/div/ngx-select-choices/ul/li[2]/a/span")).click();
		Thread .sleep(1000);  
		//Enter rej .title
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/input")).sendKeys("DVLCdemo");
		Thread .sleep(1000);  
		//enter description
		driver.findElement(By.xpath("/html/body/app-root/app-layout/div/div/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[1]/div[3]/div/textarea")).sendKeys("KEVAL VANvibhaganes nakaratmak decision dila");
		Thread .sleep(1000);  
		//click on submit butt
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(3000);

		//click on edit button
		driver.findElement(By.xpath("//button[@ class='btn text-main bg-light-main rounded me-2']")).click();
		Thread .sleep(1000);
		driver.findElement(By.xpath("// input[@ placeholder='नकार शीर्षक प्रविष्ट करा']")).clear();
		Thread .sleep(1000);
		driver.findElement(By.xpath("// input[@ placeholder='नकार शीर्षक प्रविष्ट करा']")).sendKeys("DLC Edited");
		Thread .sleep(1000);
		//update record
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[1]/form/div/div/div[2]/button[2]")).click();
		Thread .sleep(3000);
		//delete record
		driver.findElement(By.xpath("//*[@id=\"content\"]/app-claim-rejection-remark/div/div/div/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/button[2]/i")).click();
		Thread .sleep(1000);
		driver.switchTo().alert().accept();
		Thread .sleep(3000);
		//takes screenshot
		// close browser
		Thread .sleep(4000);
		driver.close();	
	}


}
