package co.com.sancanoga.mobiletest.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleTranslatePage {

	public static final Target POP_UP_OFFLINE_MODE_BUTTON_DONE = Target.the("por up configuration offline mode button done")
			.located(By.id("com.google.android.apps.translate:id/button_done"));
	public static final Target PRINCIPAL_PAGE_BUTTON = Target.the("principal page button")
			.located(By.id("com.google.android.apps.translate:id/lyt_home"));
	public static final Target SOURCE_LANGUAGE_DROPDOWN = Target.the("source language dropdown")
			.located(By.id("com.google.android.apps.translate:id/picker1"));
	public static final Target TARGET_LANGUAGE_DROPDOWN = Target.the("target language dropdown")
			.located(By.id("com.google.android.apps.translate:id/picker2"));
	public static final Target SEARCH_LANGUAGE_BUTTON = Target.the("search language button")
			.located(By.id("com.google.android.apps.translate:id/languages_search"));
	public static final Target SEARCH_LANGUAGE_FIELD = Target.the("search language field")
			.located(By.id("com.google.android.apps.translate:id/search_src_text"));
	public static final Target FIRST_RESULT_LANGUAGE_SEARCH = Target.the("first result language search")
			.located(By.id("android:id/text1"));
	public static final Target SOURCE_LANGUAGE_FIELD = Target.the("source language field")
			.located(By.id("com.google.android.apps.translate:id/touch_to_type_text"));
	public static final Target SOURCE_LANGUAGE_INPUT = Target.the("source language input")
			.located(By.id("com.google.android.apps.translate:id/edit_input"));
	public static final Target RESULT_LANGUAGE_CONTAINER = Target.the("result language container")
			.locatedBy("//android.widget.TextView[@text=\"{0}\"]");
	public static final Target CONFIRM_BUTTON = Target.the("confirm button")
			.located(By.id("com.google.android.apps.translate:id/result_selector"));

}
