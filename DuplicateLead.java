package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf",Keys.ENTER);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeevitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vishwanath");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jeevi");
		driver.findElement(By.name("departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Non IT to IT CPT");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jeevirekha28@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TidelPark");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jeevi");
		driver.findElement(By.className("smallSubmit")).click();
		String title1=driver.getTitle();
		System.out.println(title1);		
		
		
}

}



