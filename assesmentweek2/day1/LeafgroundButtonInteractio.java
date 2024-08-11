package assesmentweek2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class LeafgroundButtonInteractio {

		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://leafground.com/button.xhtml");
			
			//click button
			
			String Clickbuttontext = driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']")).getText();
			System.out.println(Clickbuttontext);
			
			
			driver.findElement(By.xpath("//span[text()='Click']")).click();
			
			//Verify that the title of the page
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Dash")) {
			System.out.println("This is title");
			}
			else
			System.out.println("This not title");	
			
			driver.navigate().back();
			
			//doubt 
			
			WebElement Enable = driver.findElement(By.xpath("(//div[@class='card'])[2]"));
			System.out.println("The Button is Enable: "+Enable.isEnabled());
		
			
			String submit = driver.findElement(By.xpath("//h5[text()='Find the position of the Submit button']")).getText();
			System.out.println(submit);
			
			if(submit.contains("Find")) {
				System.out.println("Submit");
			}
			else {
				System.out.println("Not a Submit");	
			}		
		{
			String color = driver.findElement(By.xpath("//h5[text()='Find the Save button color']")).getText();
			System.out.println(color);
			if(color.contains("Find")) {
				System.out.println("Gray color");
			}
			else {
				System.out.println("No color");
			}
			
			Dimension measurement = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']")).getSize();
			System.out.println("Find the height and width of Button"+measurement);
		
		}
		}	
	}
	
	
	
	
	
	
	
	