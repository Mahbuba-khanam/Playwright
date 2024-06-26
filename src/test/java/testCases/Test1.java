package testCases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Test1 {

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

		Thread.sleep(5000);

		page.locator("text=LOG IN").click();
		Thread.sleep(5000);
		// input[@name='mailuid']
		page.locator("//input[@name='mailuid']").fill("testpilot@gmail.com");
		// Absolute xPath = /html/body/div[2]/form/input[1]
		// relative xPath = //input[name="mailuid"]
		Thread.sleep(3000);
		page.locator("//input[@name='pwd']").fill("1234");
		Thread.sleep(3000);
		page.locator("//input[@name='login-submit']").click();
		System.out.println("Test pass");
		page.close();
		browser.close();
		playwright.close();

	}

}
