package com.satrack.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

	public static final Target USERNAME_INPUT = Target.the("username input")
			.locatedBy("//android.widget.EditText[@text='Usuario']");
	public static final Target PASSWORD_INPUT = Target.the("password input")
			.locatedBy("//android.widget.EditText[@text='Contraseña']");
	public static final Target LOGIN_BUTTON = Target.the("login button")
			.locatedBy("//android.widget.Button[@text='INGRESAR']");
	public static final Target ERROR_LOGIN_MESSAGE = Target.the("error login message")
			.locatedBy("//android.widget.TextView[@text='{0}']");
}
