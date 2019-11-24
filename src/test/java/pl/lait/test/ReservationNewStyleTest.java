package pl.lait.test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pl.lait.pageObjects.MainPage;

public class ReservationNewStyleTest {

	WebDriver driver;

	@Before
	public void openPage() {
		System.out.println(" -- wewn before");
		driver = Init.getDriver();
	}
	@Test
	public void loginTest() {
		System.out.println(" -- wewn loginTest");
		MainPage mp = new MainPage(driver);
		mp.goToLoginPage();
		mp.loginAs("btk", "btk");
		
		//ReservationPage
		// ... 1 etap
		// zatweirdzam guzikiem continue
		// konstruktor dla reservatinPage
		//wypelniam 2gi etap
		//zatweirdzam guzikiem
	}

}