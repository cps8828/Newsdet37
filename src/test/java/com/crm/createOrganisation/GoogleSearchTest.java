package com.crm.createOrganisation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.genericUtilities.*;

public class GoogleSearchTest  extends BaseClass{
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
	}

}
