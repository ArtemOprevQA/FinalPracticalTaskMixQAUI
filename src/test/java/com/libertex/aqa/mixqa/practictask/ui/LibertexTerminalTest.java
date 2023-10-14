package com.libertex.aqa.mixqa.practictask.ui;

import org.testng.annotations.Test;

public class LibertexTerminalTest extends BaseTest{

    LibertexTerminalMainPage libertexTerminalMainPage = new LibertexTerminalMainPage();

    LibertexTerminalLoginPage libertexTerminalLoginPage = new LibertexTerminalLoginPage();

    LibertexTerminalProfilePage libertexTerminalProfilePage = new LibertexTerminalProfilePage();

    LibertexTerminalLitecoinTradePage libertexTerminalLitecoinTradePage = new LibertexTerminalLitecoinTradePage();

    @Test(description = "Test Libertex Terminal")
    public void testLibertexTerminal() throws InterruptedException {

        libertexTerminalMainPage.click();

        libertexTerminalLoginPage.inputCredentials("testusermixqa@gmail.com", "123456");
        libertexTerminalLoginPage.click();

        libertexTerminalProfilePage.chooseInstrument();
        libertexTerminalProfilePage.openTrade();

        libertexTerminalLitecoinTradePage.openTrade();

    }
}
