package Test.QATestLab2;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome {

	final static String url = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
	final static String login = "webinar.test@gmail.com";
	final static String password = "Xcg7299bnSmMuRLp9ITw";

	public static void waitTest() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static WebDriver getDriver(String urlPage) {

		System.setProperty("webdriver.chrome.driver", "DriverChrome" + File.separator + "chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(urlPage);

		return driver;
	}

}
