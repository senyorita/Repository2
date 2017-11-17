package Test.QATestLab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScriptA extends DriverChrome {

	public static void main(String[] args) {

		WebDriver driver = getDriver(url);

		WebElement loginWeb = driver.findElement(By.id("email"));
		loginWeb.sendKeys(login);

		WebElement passwordWeb = driver.findElement(By.id("passwd"));
		passwordWeb.sendKeys(password);

		WebElement buttonWeb = driver.findElement(By.name("submitLogin"));
		buttonWeb.click();

		waitTest();

		WebElement userWeb = driver.findElement(By.id("employee_infos"));
		userWeb.click();

		WebElement outWeb = driver.findElement(By.id("header_logout"));
		outWeb.click();

		driver.quit();

	}

}
