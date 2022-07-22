package trial;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
	public static void main(String[] args) throws InterruptedException
	{
		//Browser Launch
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mahim\\Desktop\\Madhuri\\AUTOMATION TASKBAR\\SELENIUM\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//open Application
	driver.get("https://www.flipkart.com/");
	
	//Close Login window
	driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
	Thread.sleep(3000);
	//MoveToLogin button
	Actions act=new Actions(driver);
	act.click();
	WebElement abc=driver.findElementByXPath("//*[@class='_1_3w1N']");
	act.moveToElement(abc).build().perform();
	Thread.sleep(5000);
	
	//Click on My Profile
	driver.findElementByXPath("//*[@class='_3vhnxf']").click();
	//Enter UserName
	Thread.sleep(3000);
	driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("8149221168");
	//Enter Password
	Thread.sleep(3000);
	driver.findElementByXPath("//*[@class='_2IX_2- _3mctLh VJZDxU']").sendKeys("madhuri123");
	//Click on Login
	Thread.sleep(2000);
	driver.findElementByXPath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']").click();
	
		
	}
}
