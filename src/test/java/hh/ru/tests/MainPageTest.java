package hh.ru.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import hh.ru.pages.MainPage;
import hh.ru.pages.AutorizationPage;

@Owner("Ирина ")
@Feature("Главная страница")
@DisplayName("Главная страница")
public class MainPageTest extends TestBase{

    MainPage mainPage = new MainPage();
    AutorizationPage autorizationPage = new AutorizationPage();

    @Test
    @Tag("web")
    @Story("Регистрация")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Переход на страницу регистрации")
    void loginByEmailAndPasswordTest() {
        mainPage.openPage()
                .clickSignUbButton();
        autorizationPage.checkOpeningAutorizationPage();
    }
}
