package steps;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.NewCarsPage;
import page.objects.ToyotaCarPage;
//import page.objects.ToyotaCarPage;
import pages.base.BasePage;
import utils.SeleniumDriver;

public class CarWaleSteps {

	HomePage home = new HomePage();
	NewCarsPage car;
	ToyotaCarPage toyota = new ToyotaCarPage();

	@Given("user navigate to carwale website")
	public void user_navigate_to_carwale_website() {

		SeleniumDriver.openPage(SeleniumDriver.config.getProperty("testsiteurl"));
	}

	@When("user mouseover to newcars")
	public void user_mouseover_to_newcars() {

		home.mouseOverNewCars();

	}

	@Then("user clicks on Findnewcars")
	public void user_clicks_on_findnewcars() {

		car = home.clickFindNewCars();
		//car.gotoKia();
	}

	@And("user clicks on {string} car")
	public void user_clicks_on_car(String carBrand) {
		if (carBrand.equals("Toyota")) {

			toyota = car.gotoToyota();
		} else if (carBrand.equals("Kia")) {

			car.gotoKia();
		} else if (carBrand.equals("BMW")) {

			car.gotoBMW();
		} 
//		else if (carBrand.equals("Honda")) {
//
//			car.gotoHonda();
//		}
	}

	@And("user validates carTitle as {string}")
	public void user_validates_car_title(String carTitle) {

		Assert.assertTrue(BasePage.carBase.getCarTitle().equals(carTitle));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
