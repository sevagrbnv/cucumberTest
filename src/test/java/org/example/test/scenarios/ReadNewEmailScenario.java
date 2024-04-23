package org.example.test.scenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReadNewEmailScenario {
    @And("есть непрочитанное письмо во входящих")
    public void hasUnreadEmailInTheInbox() {

    }

    @When("пользователь открывает письмо")
    public void userOpensTheEmail() {
    }

    @Then("пользователь видит содержимое письма")
    public void userSeesTheContentOfTheEmail() {
    }

    @And("письмо помечается как прочитанное")
    public void emailIsMarkedAsRead() {
    }
}
