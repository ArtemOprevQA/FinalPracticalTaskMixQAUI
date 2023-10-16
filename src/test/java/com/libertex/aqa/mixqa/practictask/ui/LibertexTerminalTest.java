package com.libertex.aqa.mixqa.practictask.ui;

import Pages.LibertexTerminalInstrumentTradePage;
import Pages.LibertexTerminalProfilePage;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

public class LibertexTerminalTest extends BaseTest{

    private LibertexTerminalProfilePage libertexTerminalProfilePage = new LibertexTerminalProfilePage();

    private LibertexTerminalInstrumentTradePage libertexTerminalInstrumentTradePage = new LibertexTerminalInstrumentTradePage();

    @Test(description = "Test Libertex Terminal")
    public void testLibertexTerminal() throws InterruptedException {

        String email = "testusermixqa@gmail.com";

        String password = "123456";

        libertexTerminalMainPage.clickLoginButton();

        libertexTerminalLoginPage.inputCredentials(email, password);
        libertexTerminalLoginPage.clickLoginButton();

        libertexTerminalProfilePage.clickOnBuyTabForDefaultInstrument();

        libertexTerminalInstrumentTradePage.openDefaultInstrumentTrade();
        libertexTerminalInstrumentTradePage.waitingForNotification();
        libertexTerminalInstrumentTradePage.getNotificationField().shouldHave(Condition.text("Successful trade! Your balance will be updated shortly."));
    }
}
