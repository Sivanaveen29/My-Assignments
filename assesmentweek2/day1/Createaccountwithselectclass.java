package assesmentweek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createaccountwithselectclass {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.className("inputBox")).sendKeys("Naveen");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement Id = driver.findElement(By.name("industryEnumId"));
		Select option=new Select(Id);
		option.selectByIndex(3);
		WebElement Id2 = driver.findElement(By.name("ownershipEnumId"));
		Select Option2=new Select(Id2);
		Option2.selectByVisibleText("S-Corporation");
		WebElement Id3 = driver.findElement(By.name("dataSourceId"));
		Select Option3=new Select(Id3);
		Option3.selectByValue("LEAD_EMPLOYEE");
		WebElement Id4 = driver.findElement(By.name("marketingCampaignId"));
		Select Option4=new Select(Id4);
		Option4.selectByIndex(6);
		WebElement Id5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select Option5=new Select(Id5);
		Option5.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
	}
}