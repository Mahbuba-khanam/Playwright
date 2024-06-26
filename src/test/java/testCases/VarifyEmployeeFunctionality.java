package testCases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class VarifyEmployeeFunctionality {

	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page=browser.newPage();
		//page.navigate("https://www.google.com");
		//page.locator("#APjFqb").fill("Bangladesh");
		page.navigate("https://it.microtechlimited.com");
		page.click("text=LOG IN");
		page.locator("[@name=mailuid]").fill("testpilot@gmail.com");
		page.locator("[name=pwd]").fill("1234");
		page.click("[name=login-submit]");
		page.close();
		browser.close();
		playwright.close();
		

	}

}
