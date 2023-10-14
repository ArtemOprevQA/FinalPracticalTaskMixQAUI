package com.libertex.aqa.mixqa.practictask.ui;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LibertexTerminalLoginPage {

    private SelenideElement emailField = $(By.id("login-field"));

    private SelenideElement passwordField = $(By.id("password-field"));

    private SelenideElement loginButton = $(By.cssSelector("input[type='submit'][value='Log in']"));

    @Step("Set email: '{query1}' and password: '{query2}' to its fields")
    public void inputCredentials(String query1, String query2) {
        emailField.setValue(query1);
        passwordField.setValue(query2);
    }

    @Step("Click on the 'Login' button on login page")
    public void click() {
        loginButton.click();
    }
}
