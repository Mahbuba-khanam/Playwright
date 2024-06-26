package testCases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright;
		playwright =  Playwright.create();
		
		LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);
		
		Browser browser;
		browser = playwright.chromium().launch(launchOptions);
		
		Page page;
		page = browser.newPage();
		
		page.navigate("https://it.microtechlimited.com");
		System.out.println(page.title());
		
		page.locator("//a[text()='LOG IN']").click();
		Thread.sleep(6000);
		page.locator("//a[text()='Customer Login']").click();
		Thread.sleep(6000);
		page.locator("//input[@name='mailuid']").fill("david@gmail.com");
		Thread.sleep(6000);
		page.locator("//input[@name='pwd']").fill("1234");
		Thread.sleep(6000);
		page.locator("//input[@name='login-submit']").click();
		Thread.sleep(6000);
		page.locator("//a[text()='Log Out']").click();
		Thread.sleep(6000);
		
		
		
		
		
		
		

	}

}
