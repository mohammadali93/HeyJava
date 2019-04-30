package com.class28;

public class TestWebDriver {

	public static void main(String[] args) {
		WebDriver web= new ChromerDriver();
		web.openBrowser();
		web.closeBrowser();
		web.findElement();
		web.maximizeWindow();
		
		System.out.println(">>>>>>>>>>>Printing Firefox browser>>>>>>>>>>>>>>>");
		
		WebDriver web2= new FirefoxDriver();
		web2.openBrowser();
		web2.closeBrowser();
		web2.findElement();
		web2.maximizeWindow();
	}
}
