package com.libertex.aqa.mixqa.practictask.ui;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class LibertexTerminalLitecoinTradePage {

    private SelenideElement ltcusdOpenTradeButton = $(".a-submit[data-growth='Buy'][data-reduction='Sell'][data-signal-growth='Buy by signal'][data-signal-reduction='Sell by signal']");

    public SelenideElement notificationField = $("[class='box-row box-row-text'] p");

    @Step("Open trade for Litecoin")
    public void openTrade()  {
        ltcusdOpenTradeButton.click();
    }
}
