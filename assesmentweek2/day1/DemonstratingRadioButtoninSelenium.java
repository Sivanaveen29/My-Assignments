package assesmentweek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemonstratingRadioButtoninSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
	
		driver.findElement(By.xpath("//label[text()='Firefox']")).click();
		
		
		//Doubt
		WebElement cd = driver.findElement(By.xpath("//div[@id='j_idt87:city2']/div[1]/div[2]/div[1]/div[2]/span[1]"));
		cd.click();
		
		cd.click();
		System.out.println(cd.isSelected());
		
		//Doubt
		boolean Default = driver.findElement(By.xpath("//div[@class='ui-g-12 ui-md-4']")).isSelected();
		System.out.println("Default option is selected:"+Default);
		
		//doubt
		boolean GroupButton = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		System.out.println("Default option is selected:"+GroupButton);
		
	}

}


