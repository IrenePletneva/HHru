package hh.ru.pages;


import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class AutorizationPage {

    private final SelenideElement signupWrapper = $(".signup-wrapper");

    @Step("Проверить открытие страницы регистрации")
    public AutorizationPage checkOpeningAutorizationPage() {
        signupWrapper.shouldBe(appear );
        return this;
    }
}