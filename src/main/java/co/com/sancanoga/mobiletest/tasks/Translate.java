package co.com.sancanoga.mobiletest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static co.com.sancanoga.mobiletest.userinterfaces.GoogleTranslatePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class Translate implements Task {

	private String sourceWord;

	public Translate(String sourceWord) {
		this.sourceWord = sourceWord;
	}

	@Step("{0} translate a #EnglishWord")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Check.whether(the(POP_UP_OFFLINE_MODE_BUTTON_DONE), isVisible())
						.andIfSo(Click.on(POP_UP_OFFLINE_MODE_BUTTON_DONE),Click.on(PRINCIPAL_PAGE_BUTTON)),
				Click.on(SOURCE_LANGUAGE_DROPDOWN), Click.on(SEARCH_LANGUAGE_BUTTON),
				Enter.theValue("English").into(SEARCH_LANGUAGE_FIELD),
				Click.on(FIRST_RESULT_LANGUAGE_SEARCH),
				Click.on(TARGET_LANGUAGE_DROPDOWN), Click.on(SEARCH_LANGUAGE_BUTTON),
				Enter.theValue("Spanish").into(SEARCH_LANGUAGE_FIELD),
				Click.on(FIRST_RESULT_LANGUAGE_SEARCH), Click.on(SOURCE_LANGUAGE_FIELD),
				Enter.theValue(sourceWord).into(SOURCE_LANGUAGE_INPUT),
				Click.on(CONFIRM_BUTTON));
	}

	public static Performable theWord(String sourceWord) {
		return instrumented(Translate.class, sourceWord);
	}
}
	

