package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.Adactin_Baseclass.BaseClass;
import com.Adactin_Pojo.Home_Pojo;
import com.Cucumber.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def extends BaseClass {

	public static WebDriver driver = Test_Runner.driver;
	Home_Pojo om1 = new Home_Pojo(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
	url("https://adactinhotelapp.com/index.php");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		inputvalues(om1.getUsername(), "velanvic");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		inputvalues(om1.getPassword(), "Velan@1995");

	}

	@Then("^user Click On The Login Buttn And It Navigate To The Searh Hotel Page$")
	public void user_Click_On_The_Login_Buttn_And_It_Navigate_To_The_Searh_Hotel_Page() throws Throwable {
		clickOptions(om1.getLogin_button());
	}


@When("^user Select The Location$")
public void user_Select_The_Location() throws Throwable {
	dropselect(om1.getLocation(), "byvisibletext", "New York");
}

@When("^user Select The Hotel$")
public void user_Select_The_Hotel() throws Throwable {
	dropselect(om1.getHotel(), "byvalue", "Hotel Hervey");
}

@When("^user Select The Room Type$")
public void user_Select_The_Room_Type() throws Throwable {
	dropselect(om1.getRoom_type(), "byvisibletext", "Deluxe");
}

@When("^user Select The Number Of Rooms$")
public void user_Select_The_Number_Of_Rooms() throws Throwable {
	dropselect(om1.getRoom_nos(), "byvalue", "5");
}

@When("^user Select The Check In Date$")
public void user_Select_The_Check_In_Date() throws Throwable {
	delete(om1.getDatecheckin());
	inputvalues(om1.getDatecheckin(), "25/12/2021");
}

@When("^user Select The Check Out Date$")
public void user_Select_The_Check_Out_Date() throws Throwable {
	delete(om1.getDatecheckout());
	inputvalues(om1.getDatecheckout(), "30/12/2021");
}

@When("^user Select The Adult Per Room$")
public void user_Select_The_Adult_Per_Room() throws Throwable {
	dropselect(om1.getAdultroom(), "byvalue", "2");
}

@When("^user Select The Children Per Room$")
public void user_Select_The_Children_Per_Room() throws Throwable {
	dropselect(om1.getChildroom(), "by value", "1");
}

@Then("^user Click On The Search Button And It Navigate To Hotel List Page$")
public void user_Click_On_The_Search_Button_And_It_Navigate_To_Hotel_List_Page() throws Throwable {
	clickOptions(om1.getSubmit());
}

@When("^user Click On The Hotel In Selected Location$")
public void user_Click_On_The_Hotel_In_Selected_Location() throws Throwable {
	clickOptions(om1.getRadiobutton());
}

@Then("^user Click On The Continue Button And It Navigate To The User Details Page$")
public void user_Click_On_The_Continue_Button_And_It_Navigate_To_The_User_Details_Page() throws Throwable {
	clickOptions(om1.getContinue_Button());
}

@When("^user Enter The FirstName In FirstName Field$")
public void user_Enter_The_FirstName_In_FirstName_Field() throws Throwable {
	inputvalues(om1.getFirst_name(), "Velan");
}

@When("^user Enter The LastName In LastName Field$")
public void user_Enter_The_LastName_In_LastName_Field() throws Throwable {
	inputvalues(om1.getLast_name(), "DG");
}

@When("^user Enter The Billing Address In The Address Field$")
public void user_Enter_The_Billing_Address_In_The_Address_Field() throws Throwable {
	inputvalues(om1.getAddress(), "Veerapandian nagar ");
}

@When("^user Enter The Card Number In The Card Number Field$")
public void user_Enter_The_Card_Number_In_The_Card_Number_Field() throws Throwable {
	inputvalues(om1.getCc_num(), "5489456978962456");
}

@When("^user Select The Card Type$")
public void user_Select_The_Card_Type() throws Throwable {
	dropselect(om1.getCc_type(), "byvalue", "VISA");
}

@When("^user Select The Month And Year$")
public void user_Select_The_Month_And_Year() throws Throwable {
	dropselect(om1.getCc_exp_month(), "byvisibletext", "December");
	dropselect(om1.getCc_exp_year(), "byvalue", "2022");
}

@When("^user Enter The Card Cvv In The Cvv Field$")
public void user_Enter_The_Card_Cvv_In_The_Cvv_Field() throws Throwable {
	inputvalues(om1.getCc_cvv(), "548");
}

@Then("^user Click On The Book Now Button And It Navigate To The$")
public void user_Click_On_The_Book_Now_Button_And_It_Navigate_To_The() throws Throwable {
	clickOptions(om1.getBook_now());
}

@Then("^user Click On The Myltineary Button And It Navigate To The Booking COnform Page$")
public void user_Click_On_The_Myltineary_Button_And_It_Navigate_To_The_Booking_COnform_Page() throws Throwable {
	implicitwait(3000);
	clickOptions(om1.getMy_itinerary());
}


@Then("^user Click On The Logout$")
public void user_Click_On_The_Logout() throws Throwable {
	clickOptions(om1.getLogout());
}


}
