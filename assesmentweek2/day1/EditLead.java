package assesmentweek2.day1;

	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class EditLead {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://leaftaps.com/opentaps/");
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("SIVA testing");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Siva");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("naveen");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("sivalingam");
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("computer");
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Sivanaveen567@gmail.com");
			WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select option1 =new Select(state);
			option1.selectByVisibleText("New York");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.linkText("Edit")).click();
			driver.findElement(By.id("updateLeadForm_description")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("notes updated");
			driver.findElement(By.name("submitButton")).click();
			Thread.sleep(5000);
			driver.close();
			
		
		
		}
		
		
		
	}
