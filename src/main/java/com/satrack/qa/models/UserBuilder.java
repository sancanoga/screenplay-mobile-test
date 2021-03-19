package com.satrack.qa.models;

import com.satrack.qa.tasks.Login;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserBuilder {

    private String username;

    public UserBuilder withUsername(String username){
        this.username = username;
        return this;
    }

    public Performable andPassword(String password) {
        return instrumented(Login.class, this.username, password);

    }
}
