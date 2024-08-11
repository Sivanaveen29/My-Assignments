package assesmentweek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionswithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/checkbox.xhtml");
	
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		String verify = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		
		//Doubt
		//To freeze the page In console type Allow pasting 
		 
		//setTimeout(function(){debugger;},3000);
		
		System.out.println(verify);
		
		if(verify.contains("Che")) {
			System.out.println("check box is Checked");
		}
		else {
			System.out.println("check box is Unchecked");
	}
		//fav language
		driver.findElement(By.xpath("//label[contains(text(),'Ja')]")).click();
		
		//tri state checkbox
		WebElement check = driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']//div)[2]"));
		check.click();
		check.click();
		
		String text = driver.findElement(By.xpath("//p[text()='State = 2']")).getText();
		System.out.println(text);
		
		//toggle switch
		driver.findElement(By.xpath("//div[@class=\"ui-toggleswitch-slider\"]")).click();
		
		String text2 = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(text2);
	
	
		String text3 = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).getText();
		
		if(text3.contains("Disabled")) {
			System.out.println("Button is disabled");
		}
		else {
			System.out.println("Button is Enabled");
		}
		
		driver.findElement(By.xpath("(//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all'])")).click();
		 
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		String text4 = driver.findElement(By.xpath("(//label[text()='London'])[2]")).getText();
		System.out.println(text4);
		
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		String text5 = driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).getText();
		System.out.println(text5);
		
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		String text6 = driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).getText();
		System.out.println(text6);
		
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-close')]")).click();
		
		Thread.sleep(10000);
		driver.close();	
	} 
}


