package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	ChromeDriver driver = new ChromeDriver();
	
	String output;
	public void login() {
		// TODO Auto-generated method stub
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	public void findLeads() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	
	public void phone() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("470643507");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	public void id() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a[@class='linktext'])[1]"));
		output = element.getText();
		System.out.println(output);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner')]/a[@class='linktext'])[1]")).click();

		
	}
	
	public void delete() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
	}
	public void check() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		//WebElement input = driver.findElement(By.xpath("//div[contains(@class,'x-form-element')]/input[@class=' x-form-text x-form-field ']"));
		//input.sendKeys(output);
		driver.findElement(By.xpath("(//label[contains(text(),'Lead ID:')]/following::input)[1]")).sendKeys(output);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.close();

	}
	
	

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		DeleteLead dl = new DeleteLead();
		
		dl.login();
		dl.findLeads();
		dl.phone();
		dl.id();
		dl.delete();
		dl.findLeads();
		dl.check();
		
	}

}
