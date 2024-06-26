package testCases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

//	import com.microsoft.playwright.Browser;
//	import com.microsoft.playwright.BrowserType;
//	import com.microsoft.playwright.BrowserType.LaunchOptions;
//	import com.microsoft.playwright.Page;
//	import com.microsoft.playwright.Playwright;
public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright;
		playwright = Playwright.create();

		LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);
		Page page;
		page = browser.newPage();
		page.navigate("https://it.microtechlimited.com");
			
		System.out.println( page.title() );
		Thread.sleep(2000);

		page.locator("text=LOG IN").click();
		Thread.sleep(2000);
//		page.locator("//a[text()='Customer Login']").click();
//		Thread.sleep(2000);
//		page.locator("//input[@name='mailuid']").fill("david@gmail.com");
//		
//		page.locator("//input[@name='pwd']").fill("1234");
//		Thread.sleep(3000);
//		page.locator("//input[@name='login-submit']").click();
//		System.out.println(page.title());
//		 System.out.println("Test Pass");	 
//		 page.close();
//		 browser.close();
//		 playwright.close();
//		 
//	}
//
//}
//		

	}

}
