package com.satrack.qa.stepdefinitions;

import com.satrack.qa.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import static com.satrack.qa.userinterfaces.LoginPage.*;

public class LoginStepDefinitions {

	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@When("^Susan login with wrong username (.*) and password (.*)$")
	public void loginWithUsernameCompanyAndPasswordCompany(String username, String password) throws Exception {
		theActorCalled("Susan").attemptsTo(Login.theUser().withUsername(username).andPassword(password));
	}

	@Then("^she should see the error message (.*)$")
	public void sheShouldSeeTheErrorMessage(String errorMessage) throws Exception {
		OnStage.theActorInTheSpotlight().should(seeThat(the(ERROR_LOGIN_MESSAGE.of(errorMessage)),isVisible()));
	}
}
