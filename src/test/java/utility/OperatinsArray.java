package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OperatinsArray
{

	static ChromeDriver driver;
	public static Hashtable<String,Object> outputparameters=new Hashtable<String,Object>();
	public static Hashtable<String,Object> bLaunch(Object[]inputparameters)
	{
		try
		{
		String strBrowserName=(String)inputparameters[0];
		String strExe=(String)inputparameters[1];
		System.setProperty(strBrowserName,strExe);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputparameters.put("STATUS","PASS");
		outputparameters.put("Message","MethodUsed: bLaunch,Input Given:" +inputparameters[0].toString());
		}
	catch(Exception e)
		{

		outputparameters.put("STATUS","FAIL");
		outputparameters.put("Message","MethodUsed: bLaunch,Input Given:" +inputparameters[1].toString());
		}
		return outputparameters;
	}
	
	public static Hashtable<String,Object> openApplication(Object[]inputparameters)
	{
		try
		{
		String path=(String)inputparameters[0];
		driver.get(path);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		outputparameters.put("STATUS","PASS");
		outputparameters.put("Message","MethodUsed: openApplication,Input Given:" +inputparameters[0].toString());
		
		}
		catch(Exception e)
		{

			outputparameters.put("STATUS","FAIL");
			outputparameters.put("Message","MethodUsed: openApplication,Input Given:" +inputparameters[1].toString());
		}
		return outputparameters;
	}
		
	public static Hashtable<String,Object> navigateToEle(Object[]inputparameters)
	{
		try
		{
		String xpath=(String)inputparameters[0];
		Actions act=new Actions(driver);
		act.click();
		WebElement abc=driver.findElementByXPath(xpath);
		act.moveToElement(abc).build().perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		outputparameters.put("STATUS","PASS");
		outputparameters.put("Message","MethodUsed: navigateToEle,Input Given:" +inputparameters[0].toString());
		}
		catch(Exception e)
		{

			outputparameters.put("STATUS","FAIL");
			outputparameters.put("Message","MethodUsed: navigateToEle,Input Given:" +inputparameters[0].toString());
		}
		return outputparameters;
	}
	
	public static Hashtable<String,Object> clickOnEle(Object[]inputparameters)
	{
		try
		{
		String xpath=(String)inputparameters[0];
		driver.findElementByXPath(xpath).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		outputparameters.put("STATUS","PASS");
		outputparameters.put("Message","MethodUsed: clickOnEle,Input Given:" +inputparameters[0].toString());
		}
		catch(Exception e)
		{

			outputparameters.put("STATUS","FAIL");
			outputparameters.put("Message","MethodUsed: clickOnEle,Input Given:" +inputparameters[0].toString());
		}
		return outputparameters;
	}
	
	public static Hashtable<String,Object> enterUName(Object[]inputparameters)
	{
		try
		{
		String xpath=(String)inputparameters[0];
		String name=(String)inputparameters[1];
		driver.findElementByXPath(xpath).sendKeys(name);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		outputparameters.put("STATUS","PASS");
		outputparameters.put("Message","MethodUsed: enterUName,Input Given:" +inputparameters[1].toString());
		}
		catch(Exception e)
		{

			outputparameters.put("STATUS","FAIL");
			outputparameters.put("Message","MethodUsed: enterUName,Input Given:" +inputparameters[1].toString());
		}
		return outputparameters;
	}
	
		
	public static void main(String[] args) throws InterruptedException
	{
		//BrowserLaunch
		Object[] input1=new Object[2];
		input1[0]="webdriver.chrome.driver";
		input1[1]="C:\\Users\\mahim\\Desktop\\Madhuri\\AUTOMATION TASKBAR\\SELENIUM\\chromedriver.exe";
		OperatinsArray.bLaunch(input1);
	
		Object[] input2=new Object[1];
		input2[0]="https://www.flipkart.com/";
		OperatinsArray.openApplication(input2);
		
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		OperatinsArray.clickOnEle(input3);
		
		Thread.sleep(3000);
		Object[] input4=new Object[1];
		input4[0]="//*[@class='_1_3w1N']";
		OperatinsArray.navigateToEle(input4);
		
		Thread.sleep(3000);
		Object[] input5=new Object[1];
		input5[0]="//*[@class='_3vhnxf']";
		OperatinsArray.clickOnEle(input5);
		
		Thread.sleep(3000);
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- VJZDxU']";
		input6[1]="8149221168";
		OperatinsArray.enterUName(input6);		
		
		Object[] input7=new Object[2];
		input7[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input7[1]="madhuri123";
		OperatinsArray.enterUName(input7);
		
		Thread.sleep(1000);
		Object[] input8=new Object[1];
		input8[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		OperatinsArray.clickOnEle(input8);
		
	
	}
	
}
