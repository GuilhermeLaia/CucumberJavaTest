package com.cucumber.cucumbejava;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StepDefinitions {

	@Given("^Data Upload to a web service$")
	public void dataUploadToWebService() throws IOException{
		throw new NotImplementedException();
	}
	
	@When("^users upload data on a project$")
	public void usersUploadDataOnAProject() throws IOException {
	    System.out.println("User Uploading...");
	}
	
	@Then("^the server should handle it and return a success status$")
	public void theServerShouldHandleAndReturnSucessStatus() throws IOException{
		System.out.println("Return a success status!");
	}
	
	@Given("^Data retrieval from a web service$")
	public void dataRetrievalFromWebService() throws IOException{
		throw new NotImplementedException();
	}
	
	@When("^users want to get information on the (.+) project$")
	public void usersGetInformationOnAProject(String projectName) throws IOException {
		System.out.println("to get information on the" + projectName);
	}
	
	@Then("^the requested data is returned$")
	public void theRequestDataIsReturned() throws IOException{
		System.out.println("Return data is returned with success!");
	}
	
}
