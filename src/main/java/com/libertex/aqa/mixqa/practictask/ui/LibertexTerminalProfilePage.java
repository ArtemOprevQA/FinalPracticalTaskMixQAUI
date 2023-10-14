package com.libertex.aqa.mixqa.practictask.ui;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LibertexTerminalProfilePage {

    private SelenideElement ltcusdElement = $(By.xpath("//div[contains(@class, 'col-symbol') and text()='LTCUSD']"));

    private SelenideElement ltcusdBuyButton = $("a[href='#modal_newInvest_LTCUSD__%7B%22direction%22%3A%22growth%22%7D'].a-btn.new-invest.growth");
    @Step("Click on the 'Litecoin' instrument button on profile page")
    public void chooseInstrument() throws InterruptedException{
        Thread.sleep(15000);
        ltcusdElement.click();
    }
    @Step("Click on 'Buy' button for Litecoin")
    public void openTrade()  {
        ltcusdBuyButton.click();
    }

}
