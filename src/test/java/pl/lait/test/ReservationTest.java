package pl.lait.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationTest {
	WebDriver driver;

	@Before
	public void openPage() {
		driver = Init.getDriver();
	}

	@Test
	public void reserveFlight() {
		//przejscie na ekran logowania
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("btk");
		driver.findElement(By.name("password")).sendKeys("btk");
		driver.findElement(By.name("login")).click();
		String oneWayRadioXpath = "/html/body/div/table/tbody/tr/td[2]/tab"
				+ "le/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/ta"
				+ "ble/tbody/tr[2]/td[2]/b/font/input[2]";

		driver.findElement(By.xpath(oneWayRadioXpath)).click();

		WebElement passCount = driver.findElement(By.name("passCount"));
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByValue("2");

		WebElement fromPort = driver.findElement(By.name("fromPort"));
		Select fromPortSelect = new Select(fromPort);
		fromPortSelect.selectByVisibleText("London");

		WebElement fromDay = driver.findElement(By.name("fromDay"));
		Select fromDaySelect = new Select(fromDay);
		fromDaySelect.selectByVisibleText("15");

		WebElement fromMonth = driver.findElement(By.name("fromMonth"));
		Select fromMonthSelect = new Select(fromMonth);
		fromMonthSelect.selectByVisibleText("July");

		WebElement toPort = driver.findElement(By.name("toPort"));
		Select toPortSelect = new Select(toPort);
		toPortSelect.selectByVisibleText("Zurich");

		WebElement toMonth = driver.findElement(By.name("toMonth"));
		Select toMonthSelect = new Select(toMonth);
		toMonthSelect.selectByVisibleText("May");

		WebElement toDay = driver.findElement(By.name("toDay"));
		Select toDaySelect = new Select(toDay);
		toDaySelect.selectByVisibleText("25");

		String businessRadioXpath = "/html/body/div/table/tbody/tr"
				+ "/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/"
				+ "table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/" + "font/font/input[1]";

		driver.findElement(By.xpath(businessRadioXpath)).click();

		WebElement airline = driver.findElement(By.name("airline"));
		Select airlineSelect = new Select(airline);
		airlineSelect.selectByVisibleText("Unified Airlines");

		driver.findElement(By.name("findFlights")).click();

	}
	@After
	public void tearDown() {
		Init.end();
	}
}
// @After
// public void tearDown() {

// driver.close();
