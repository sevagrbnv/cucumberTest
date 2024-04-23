package org.example.test.scenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class BaseStartConditions {
    @Given("пользователь открыл почтовый клиент")
    public void userHasOpenedTheEmailClient() {
    }

    @And("пользователь авторизован в системе")
    public void userIsLoggedIn() {
    }
}
