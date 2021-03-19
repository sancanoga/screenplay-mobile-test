package com.satrack.qa.tasks;

import com.satrack.qa.models.UserBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.satrack.qa.userinterfaces.LoginPage.*;

public class Login implements Task {

	private String username;
	private String password;
	private UserBuilder userBuilder;

	public Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Step("{0} translate a #EnglishWord")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(username).into(USERNAME_INPUT),
				Enter.theValue(password).into(PASSWORD_INPUT),
				Click.on(LOGIN_BUTTON));
	}

	public static UserBuilder theUser() {
		return new UserBuilder();
	}
}