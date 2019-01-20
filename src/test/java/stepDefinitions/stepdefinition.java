package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.LoginPage;

public class stepdefinition {
			
	
    @Given("^Blank Test$")					
    public void Blank_Test() throws Throwable							
    {		
//    	LoginPage Login = new LoginPage();
//    	Login.getUsername().sendKeys("Test");
//    	Login.getPassword().sendKeys("Test");
//    	Login.getLogin().click();
//    	
    	System.out.println("Blank Test Print Given");				
    }	
    
    @When("^Blank Test1$")					
    public void Blank_Test1() throws Throwable							
    {		
    	System.out.println("Blank Test Print When");				
    }	
    
    @Then("^Blank Test2$")					
    public void Blank_Test2() throws Throwable							
    {		
    	System.out.println("Blank Test Print Then");				
    }	


}