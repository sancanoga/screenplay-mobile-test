package co.com.sancanoga.mobiletest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/google_translate.feature",
		glue = "co.com.sancanoga.mobiletest.stepdefinitions",
		snippets = SnippetType.CAMELCASE,
		tags="@translate")


public class GoogleTranslateRunner {

	private GoogleTranslateRunner(){

	}

}