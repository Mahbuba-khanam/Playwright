package testCases;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class EmployeeLogOut {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright;
		playwright = Playwright.create();
		LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);
		Browser browser;

		browser = playwright.chromium().launch(launchOptions);
		Page page;
		page = browser.newPage();
		page.navigate("https://it.microtechlimited.com");
		System.out.println(page.title());
		page.locator("//a[text()='LOG IN']").click();
		Thread.sleep(2000);
		page.locator("//a[text()='Customer Login']").click();
		// Thread.sleep(6000);
		// page.locator("//a[@class='homered']");
		Thread.sleep(6000);

		page.locator("//input[@name='mailuid']").fill("david@gmail.com");
		Thread.sleep(6000);

		page.locator("//input[@name='pwd']").fill("1234");
		// click login button
		page.locator("//input[@name='login-submit']").click();
		Thread.sleep(6000);

		String welcomeMsg = page.textContent("//h2[text()='Welcome David']");
		if (welcomeMsg.contains("Welcome David"))
			System.out.println("Test is pass");
		else
			System.out.println("Test is Fail");

//		page.locator("//input[@name='login-submit']").click();
		// logout
		Thread.sleep(6000);
		page.locator("//a[text()='Log Out']").click();
		Thread.sleep(6000);
//		// if i keep open the page.close when we run the program then the will not run

		page.close();

	}

}

//Verify WelcomeMsg = page.textContent("//h2[text()='Welcome David')"];
//if(welcomeMsg.contains("Welcome David"))
//	System.out.println("Test is pass");
//else
//	System.out.printin("Test is Fail");

//https://test.skyitschool.com/htmlalltags-v1.html

//<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
//<modelVersion>4.0.0</modelVersion>
//<groupId>com.mt</groupId>
//<artifactId>class21_Playwright_simpleProject</artifactId>
//<version>0.0.1-SNAPSHOT</version>
//
//
//
//
//
//<properties>
//		<maven.compiler.target>11</maven.compiler.target>
//		<maven.compiler.source>11</maven.compiler.source>
//	</properties>
//
//	<dependencies>
//		<!-- https://mvnrepository.com/artifact/com.microsoft.playwright/playwright -->
//		<dependency>
//			<groupId>com.microsoft.playwright</groupId>
//			<artifactId>playwright</artifactId>
//			<version>1.38.0</version>
//		</dependency>
//
//	</dependencies>
//</project>

//*****************
//page.setInputFiles("//input[@id='input__file']", Paths.get("filepath"));
//
//Playwright playwright = Playwright.create();
//playwright.chromium().launch();
//Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
