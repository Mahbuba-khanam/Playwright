package testCases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class EmployeeLoginPage {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright;
		playwright = Playwright.create();

		LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);

		Page page;
		page = browser.newPage();

		page.navigate("https://it.microtechlimited.com");
		Thread.sleep(4000);
		System.out.println(page.title());
	//	page.locator("//a[text()='LOG IN')]").click();
		 page.locator("text=LOG IN").click();
		Thread.sleep(2000);
		page.locator("//a[text()='Employee Login']").click();

		page.locator("//input[@ name='mailuid']").fill("testpilot@gmail.com");
		Thread.sleep(6000);

		page.locator("//input[@ name='pwd']").fill("1234");
		Thread.sleep(6000);
		page.locator("//input[@ name='login-submit']").click();
		Thread.sleep(6000);
		page.close();
	}
}
