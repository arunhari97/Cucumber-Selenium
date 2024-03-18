Feature: Searching new cars

In order to search new cars
As a User
I have to navigate to carwale.com

Scenario Outline: Finding new cars
		Given user navigate to carwale website
		When user mouseover to newcars
		Then user clicks on Findnewcars
		And user clicks on "<carBrand>" car
		And user validates carTitle as "<carTitle>" 	 	

Examples:		
		| carBrand | carTitle    |
		| Toyota   | Toyota Cars |
		| Kia  		 | Kia Carss    |
		| BMW      | BMW Cars    |