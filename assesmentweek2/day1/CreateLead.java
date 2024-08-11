package assesmentweek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		WebElement sd = driver.findElement(By.id("createLeadForm_companyName"));
		sd.sendKeys("SL Institute");
		WebElement rd = driver.findElement(By.id("createLeadForm_firstName"));
		rd.sendKeys("SIVA");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NAVEEN");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Assesment");
		WebElement ts = driver.findElement(By.name("submitButton"));
		ts.click();
		Thread.sleep(10000);
		driver.close();

	}
	

}
