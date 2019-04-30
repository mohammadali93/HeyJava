package com.class28;

public interface WebDriver {

	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
	
}
class FirefoxDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Firefox has an open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox has a close browser");
	}

	@Override
	public void maximizeWindow() {
		 System.out.println("Firefox has a maximize window option");
		
	}

	@Override
	public void findElement() {
		System.out.println("Firefox has a find an element option");
		
	}
	
}
class ChromerDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Chrome browser is an open browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome  has a close browser option");
		
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome has a maximize window option");
		
	}

	@Override
	public void findElement() {
		System.out.println("Chrome has a find an element option");
		
	}
	
}