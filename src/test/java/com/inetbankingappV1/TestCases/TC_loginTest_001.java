package com.inetbankingappV1.TestCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbankingappV1.PageObjects.BaseClass;
import com.inetbankingappV1.PageObjects.LoginPage;

public class TC_loginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException, IOException 
	{
		driver.get(baseURL);
		logger.info("URL is Opened");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered UserName");
		lp.setPassword(password);
		logger.info("Entered Password");
		lp.clickSubmit();
		Thread.sleep(3000);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Test is passed");
		}
		else
		{
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Test is Failed");
		}
	}

}