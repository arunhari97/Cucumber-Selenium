package page.objects;

import pages.base.BasePage;

public class HomePage extends BasePage {
	
	public void mouseOverNewCars() {
		
		mouseOver("newCarMenu_XPATH");
	}
	
	public NewCarsPage clickFindNewCars() {
		
		click("findNewCars_XPATH");
		
		return new NewCarsPage();
	}
	
	public void searchCars() {
		
	}
	
	public void gotoMaps() {
		
	}

}
