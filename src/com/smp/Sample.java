package com.smp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[]args ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MHNKING\\eclipse-workspace\\Samp\\driv\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//launch browser
		driver.get("https://www.facebook.com/");
		//title
		String ti=driver.getTitle();
	    System.out.println(ti);
	    //URL
	    String url=driver.getCurrentUrl();
	    System.out.println(url);
	}

}
