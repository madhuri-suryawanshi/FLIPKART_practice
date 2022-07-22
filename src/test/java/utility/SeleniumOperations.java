package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	static ChromeDriver driver;
	public static void bLaunch(String key,String value)
	{
		try
		{
		String strBrowserName=key;
		String strExe=value;
		System.setProperty(strBrowserName,strExe);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void openApplication(String url)
	{
		try
		{
		String path=url;
		driver.get(path);
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	public static void navigateToEle(String locator)
	{
		try
		{
		String xpath=locator;
		Actions act=new Actions(driver);
		act.click();
		WebElement abc=driver.findElementByXPath(xpath);
		act.moveToElement(abc).build().perform();
	
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void clickOnEle(String locator)
	{
		try
		{
		String xpath=locator;
		driver.findElementByXPath(xpath).click();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void enterUName(String locator,String User)
	{
		try
		{
		String xpath=locator;
		String name=User;
		driver.findElementByXPath(xpath).sendKeys(name);
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		bLaunch("webdriver.chrome.driver","C:\\Users\\mahim\\Desktop\\Madhuri\\AUTOMATION TASKBAR\\SELENIUM\\chromedriver.exe");
	
		openApplication("https://www.flipkart.com/");
		clickOnEle("//*[@class='_2KpZ6l _2doB4z']");
		Thread.sleep(3000);
		navigateToEle("//*[@class='_1_3w1N']");
		Thread.sleep(5000);
		clickOnEle("//*[@class='_3vhnxf']");
		Thread.sleep(3000);
		enterUName(("//*[@class='_2IX_2- VJZDxU']"),("8149221168"));
		enterUName(("//*[@class='_2IX_2- _3mctLh VJZDxU']"),("madhuri123"));
		Thread.sleep(3000);
		clickOnEle("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']");
		Thread.sleep(5000);

	}
}



