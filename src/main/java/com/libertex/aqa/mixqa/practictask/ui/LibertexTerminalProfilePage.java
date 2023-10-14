package com.libertex.aqa.mixqa.practictask.ui;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LibertexTerminalProfilePage {

    private SelenideElement ltcusdElement = $(By.xpath("//div[contains(@class, 'col-symbol') and text()='LTCUSD']"));

    @Step("Click on the 'Litecoin' instrument button on profile page")
    public void click() {
        ltcusdElement.click();
    }
}
