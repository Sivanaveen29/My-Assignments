package assesmentweek2.day1;

	import java.time.Duration;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class Facebook {

		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://en-gb.facebook.com/");
			driver.findElement(By.linkText("Create new account")).click();
			driver.findElement(By.name("firstname")).sendKeys("test");
			driver.findElement(By.name("lastname")).sendKeys("leaf");
			driver.findElement(By.name("reg_email__")).sendKeys("test123@gmail.com");
			driver.findElement(By.id("password_step_input")).sendKeys("testing@567");
			
			WebElement day = driver.findElement(By.name("birthday_day"));
			Select option1=new Select(day);
			option1.selectByValue("29");
			
			WebElement month = driver.findElement(By.name("birthday_month"));
			Select option2=new Select(month);
			option2.selectByValue("5");
			
			WebElement year = driver.findElement(By.name("birthday_year"));
			Select option3=new Select(year);
			option3.selectByValue("1997");
			
			driver.findElement(By.xpath("//label[text()='Male']")).click();
			
			
		}
		
		
		
		
}
