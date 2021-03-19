package co.com.sancanoga.mobiletest.stepdefinitions;

import co.com.sancanoga.mobiletest.tasks.Translate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.sancanoga.mobiletest.userinterfaces.GoogleTranslatePage.RESULT_LANGUAGE_CONTAINER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class GoogleTranslateStepDefinitions {

	@Before
	public void prepareStage() {
		OnStage.setTheStage(new OnlineCast());
	}

	@When("^Susan translate the world (.*) from english to spanish$")
	public void sheTranslateTheWorldFromEnglishToSpanish(String sourceWord) throws Exception {
		theActorCalled("Susan").attemptsTo(Translate.theWord(sourceWord));
	}

	@Then("^she should see the world (.*) in the screen$")
	public void sheShouldSeeTheWorldInTheScreen(String targetWord) throws Exception {
		OnStage.theActorInTheSpotlight().should(seeThat(the(RESULT_LANGUAGE_CONTAINER.of(targetWord)),isVisible()));
	}
}
