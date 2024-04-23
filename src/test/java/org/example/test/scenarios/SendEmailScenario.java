package org.example.test.scenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendEmailScenario {
    @When("пользователь создает новое письмо")
    public void userCreatesNewEmail() {
    }

    @And("пользователь указывает адресата и текст письма")
    public void userSpecifiesTheRecipientAndTheEmailText() {
    }

    @And("пользователь нажимает кнопку {string}")
    public void userClicksTheButton(String button) {
    }

    @Then("письмо успешно отправляется")
    public void emailIsSuccessfullySent() {
    }
}
