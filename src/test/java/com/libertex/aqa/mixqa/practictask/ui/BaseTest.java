package com.libertex.aqa.mixqa.practictask.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.$;

public class BaseTest {

    @BeforeClass
    public void setUp() {

        Configuration.timeout = 60000;

        Configuration.headless = false;
    }

    @BeforeTest
    public void openLibertexTerminal() {

        Selenide.open(System.getProperty("BASE_URL"));

        $((By.xpath("//span[contains(@class, 'login-btn')]"))).shouldBe(Condition.visible);
    }
}
