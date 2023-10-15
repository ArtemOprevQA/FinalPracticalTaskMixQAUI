package com.libertex.aqa.mixqa.practictask.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;

public class BaseTest {

    @BeforeSuite
    public void setupBrowser() throws IOException {

        Configuration.browser = System.getProperty("browser");

    }

    @BeforeTest
    public void openLibertexTerminal() {

        Selenide.open(System.getProperty("BASE_URL"));

        $((By.xpath("//span[contains(@class, 'login-btn')]"))).shouldBe(Condition.visible);
    }
}
