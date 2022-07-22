package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.OperatinsArray;

public class Login 
{
	@Given ("^user open browser with its \"(.*)\" and \"(.*)\"$")
	
	public void bLaunch(String key,String value)
	{
		Object[] input1=new Object[2];
		input1[0]=key;
		input1[1]=value;
		
		//Hashtable<String,Object> output1=OperatinsArray.bLaunch(input1);
		//HTMLReportGenerator.StepDetails(output1.get("Status").toString(),"^user open browser with its \"(.*)\" and \"(.*)\"$",output1.get("Message").toString());
	}
	
	
	@Given ("^user enter url as \"(.*)\"$")
	
	public void openApplication(String url)
	{
		Object[] input2=new Object[1];
		input2[0]=url;
	//	Hashtable<String,Object> output2=OperatinsArray.openApplication(input2);
	//	HTMLReportGenerator.StepDetails(output2.get("Status").toString(),"^user enter url as \"(.*)\"$",output2.get("Message").toString());
	}
	
	@When ("^user cancle on initial login page$")
	public void clickOnEle() throws InterruptedException
	{
		Thread.sleep(2000);
		Object[] input3=new Object[1];
		input3[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String,Object> output3=OperatinsArray.clickOnEle(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"^user cancle on initial login page$",output3.get("Message").toString());
	}
	
	@When("^user navigate on login button$")
	public void navigateToEle() throws InterruptedException
	{
		Thread.sleep(3000);
		Object[] input4=new Object[1];
		input4[0]="//*[@class='_1_3w1N']";
		Hashtable<String,Object> output4=OperatinsArray.navigateToEle(input4);	
		//HTMLReportGenerator.StepDetails(output4.get(key), StepName, StepDetails);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"^user navigate on login button$",output4.get("Message").toString());
	}
	
	@When("^user click on My Profile$")
	public void click() throws InterruptedException
	{
		Thread.sleep(3000);
		Object[] input5=new Object[1];
		input5[0]="//*[@class='_3vhnxf']";
		Hashtable<String,Object> output5=OperatinsArray.clickOnEle(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"^user click on My Profile$",output5.get("Message").toString());
	}
	
	@When ("^user enter username \"(.*)\"$")
	
	public void enterUsername(String User) throws InterruptedException
	{
		Thread.sleep(3000);
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- VJZDxU']";
		input6[1]=User;
		Hashtable<String,Object> output6=OperatinsArray.enterUName(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"^user enter username \"(.*)\"$",output6.get("Message").toString());		
	}
	
	@When ("^user enter password \"(.*)\"$")
//	@When("^user enter password \"([^\"]*)\"$")
	public void enterPass(String pass)
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input7[1]=pass;
		Hashtable<String,Object> output7=OperatinsArray.enterUName(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"^user enter password \"([^\"]*)\"$",output7.get("Message").toString());
	}
	
	@When("^user click on Login button$")
	public void clcikLogin() throws InterruptedException
	{
	
		Thread.sleep(3000);
		Object[] input8=new Object[1];
		input8[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
		Hashtable<String,Object> output8=OperatinsArray.clickOnEle(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"^user click on Login button$",output8.get("Message").toString());
	}
	
	@Then("^Application shows login successfully$")
	public void application_shows_login_successfully() throws Throwable 
	{
	   
	}

	
}


