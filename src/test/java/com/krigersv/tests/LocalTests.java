package com.krigersv.tests;

import com.krigersv.pages.ApplicationPage;
import com.krigersv.pages.ImageryPage;
import com.krigersv.pages.ResolutionPage;
import com.krigersv.pages.SearchPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.back;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.NORMAL;


@Tag("androidLocal")
@Epic(value = "Проверка приложения Wikipedia")
@Owner("Stas")
public class LocalTests extends TestBase {
    SearchPage searchPage = new SearchPage();
    ImageryPage imageryPage = new ImageryPage();
    ApplicationPage applicationPage = new ApplicationPage();
    ResolutionPage resolutionPage = new ResolutionPage();
    @Test
    @Severity(NORMAL)
    @DisplayName("Поиск текста в википедии")
    void searchTest() {
        back();
        step("Клик на поисковое поле", () ->
                searchPage.performSearch());
        step("Ввод текста в поисковом поле", () ->
                searchPage.sendSearch("Britney Spears"));
        step("Проверка результата", () ->
                searchPage.checkingResult());
    }

    @Test
    @Severity(NORMAL)
    @DisplayName("Проверка статьи")
    void openArticleTest() {

        step("Пропустить авторзиацию", () ->
                searchPage.skipOnboarding());
        step("Выполняется поиск", () ->
                searchPage.performSearch());
        step("Клик на поисковое поле", () ->
                searchPage.sendSearch("Gradle"));
        step("Подтвердить найденный контент поиска", () ->
                searchPage.checkingResult());
        step("Открыть статью", () ->
                searchPage.openArticle());
        step("Проверка изображения в статье", () ->
                imageryPage.checkImage());
    }

    @Test
    @Severity(NORMAL)
    @DisplayName("Проверка страниц wiki")
    void checkWikipediaApplicationTest() {

        step("Проверка первой страницы", () ->
                applicationPage.checkingFirst("We’ve found the following on your device:"));
        step("Переход на вторую страницу", () ->
                applicationPage.checkSecond());
        step("Проверка текста", () ->
                applicationPage.checkingSecond("New ways to explore"));
        step("Переход на третью страницу", () ->
                applicationPage.goThird());
        step("Проверка текста", () ->
                applicationPage.checkingThird("Reading lists with sync"));
        step("Переход на четвертую страницу", () ->
                applicationPage.goFour());
        step("Проверка текста", () ->
                applicationPage.checkingFour("Send anonymous data"));

    }

    @Test
    @Severity(NORMAL)
    @DisplayName("Проверка выбора языка")
    void addLanguageLocalTest() {
        back();
        step("Переход в меню приложения", () ->
                resolutionPage.menuSearch());
        step("Переход в настройки приложения", () ->
                resolutionPage.containerSearch());
        step("Выбор языка", () -> {
            resolutionPage.language("Wikipedia language");
            resolutionPage.choiceLanguage("Add language");
            resolutionPage.locution("Deutsch");
        });
        step("Проверка, что выбранный язык добавлен", () ->
                resolutionPage.checkLanguage("Deutsch"));
    }

    @Test
    @Severity(NORMAL)
    @DisplayName("Проверка страницы авторизации")
    void verifyOpeningOfResolutionPageTest() {
        back();
        step("Переход в меню приложения", () ->
                resolutionPage.login());
        step("Переход на страницу авторзиации/создания нового аккаунта", () ->
                resolutionPage.drawer());
        step("Проверка, что открыта страница авторизации/создания нового аккаунта", () ->
                resolutionPage.checkVerify("Create an account"));

    }
}
