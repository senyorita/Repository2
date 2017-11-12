package Test.QATestLab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScriptB extends DriverChrome {

	private static void getTitle(WebElement elem, WebDriver driver) {

		elem.click();
		String title1 = driver.getTitle();
		System.out.println("Заголовок открытого раздела до обновления: " + title1);
		driver.navigate().refresh();
		String title2 = driver.getTitle();
		System.out.println("Заголовок открытого раздела после обновления: " + title2);
		if (title1.equals(title2))
			System.out.println("Заголовки раздела равны");
		else

			System.out.println("Заголовки раздела не равны");

	}

	public static void main(String[] args) {

		WebDriver driver = getDriver(url);

		WebElement loginWeb = driver.findElement(By.id("email"));
		loginWeb.sendKeys(login);

		WebElement passwordWeb = driver.findElement(By.id("passwd"));
		passwordWeb.sendKeys(password);

		WebElement buttonWeb = driver.findElement(By.name("submitLogin"));
		buttonWeb.click();

		waitTest();

		WebElement dashboardWeb = driver.findElement(By.xpath("//*[@id='tab-AdminDashboard']/a"));
		getTitle(dashboardWeb, driver);

		WebElement zakaziWeb = driver.findElement(By.xpath("//*[@id='subtab-AdminParentOrders']/a"));
		getTitle(zakaziWeb, driver);

		WebElement katalogWeb = driver.findElement(By.xpath("//*[@id='subtab-AdminCatalog']/a"));
		getTitle(katalogWeb, driver);

		WebElement clientyWeb = driver.findElement(By.xpath("/html/body/nav/ul/li[5]/a"));
		getTitle(clientyWeb, driver);

		WebElement tehsupportWeb = driver.findElement(By.xpath("//*[@id='subtab-AdminParentCustomerThreads']/a"));
		getTitle(tehsupportWeb, driver);

		WebElement statistikaWeb = driver.findElement(By.xpath("//*[@id='subtab-AdminStats']/a"));
		getTitle(statistikaWeb, driver);

		WebElement modulesWeb = driver.findElement(By.xpath("//*[@id='subtab-AdminParentModulesSf']/a"));
		getTitle(modulesWeb, driver);

		WebElement designWeb = driver.findElement(By.xpath("/html/body/nav/ul/li[10]/a"));
		getTitle(designWeb, driver);

		WebElement deliveryWeb = driver.findElement(By.xpath("//*[@id='subtab-AdminParentShipping']/a"));
		getTitle(deliveryWeb, driver);

		WebElement paymentWeb = driver.findElement(By.xpath("//*[@id='subtab-AdminParentPayment']/a"));
		getTitle(paymentWeb, driver);

		WebElement internationalWeb = driver.findElement(By.xpath("//*[@id='subtab-AdminInternational']/a"));
		getTitle(internationalWeb, driver);

		WebElement shopParametersWeb = driver.findElement(By.xpath("//*[@id='subtab-ShopParameters']/a"));
		getTitle(shopParametersWeb, driver);

		WebElement configurationWeb = driver.findElement(By.xpath("//*[@id='subtab-AdminAdvancedParameters']/a"));
		getTitle(configurationWeb, driver);

		driver.quit();

	}

}
