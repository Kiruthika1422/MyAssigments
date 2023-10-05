package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kiruthi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Arjunan");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Kiruthika");
		driver.findElement(By.name("departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This for Testing purpose");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kiruthikaarjunan2000@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("470643507");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd_state = new Select(state);
		dd_state.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("This is to check edit");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
