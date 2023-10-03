package org.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
@Given("User creates the request object")
public void user_creates_the_request_object() {
	System.out.println("https://reqres.in");
}
@When("User attach the querry prameter")
public void user_attach_the_querry_prameter() {
	System.out.println("/api/users");
    
}
@When("User attach the path parameter")
public void user_attach_the_path_parameter() {
   System.out.println("/api/users/2");
}
@And("Single User Not Found")
public void Single_User_Not_Found() {
   System.out.println("/api/users/23");
}
@When("List of Resources")
public void list_of_resources() {
  System.out.println("api/Unkonwn");
}

@When("Update the Employee")
public void update_the_employee() {
  System.out.println("/api/users/2");
}
@When("Delete the Employee")
public void delete_the_employee() {
   System.out.println("/api/users/2");
}

@And("User creates  the respnse object")
public void user_creates_the_respnse_object() {
	System.out.println("page");
}
@Then("User Validates the response code and response body")
public void user_validates_the_response_code_and_response_body() {
	System.out.println("Validation Of Response is Done");
  
}



}
