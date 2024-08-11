package assesmentweek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

	public class DeleteLead {

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
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("(//span[text()='Phone'])")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9176107601");
			//find leads button
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			driver.findElement(By.xpath("//a[text()='siva']")).click();
			//delete button
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			//find lead 
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys("15461");
			driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
			
			
			String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			System.out.println(text);
			
			if(text.contains("No record"))
				System.out.println("lead deleted");
			else
				System.out.println("lead not delete");
			
				
	}
}