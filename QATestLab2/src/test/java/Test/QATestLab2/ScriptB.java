package Test.QATestLab2;

import java.util.ArrayList;
import java.util.List;

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
		
		List<String> listMenu = new ArrayList<String>();
		listMenu.add("Dashboard");
		listMenu.add("Заказы");
		listMenu.add("Каталог");
		listMenu.add("Клиенты");
		listMenu.add("Служба поддержки");
		listMenu.add("Статистика");
		listMenu.add("Modules");
		listMenu.add("Design");
		listMenu.add("Доставка");
		listMenu.add("Способ оплаты");
		listMenu.add("International");
		listMenu.add("Shop Parameters");
		listMenu.add("Конфигурация");
		
		for(int i = 0; i < listMenu.size(); i++){
			getTitle(driver.findElement(By.linkText(listMenu.get(i))), driver);
		}

		driver.quit();

	}

}
