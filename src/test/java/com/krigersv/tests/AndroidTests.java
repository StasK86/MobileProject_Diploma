package com.krigersv.tests;

import com.krigersv.pages.ResolutionPage;
import com.krigersv.pages.SearchPage;
import com.krigersv.pages.StackPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Tag("android")
@Epic(value = "Проверка приложения Wikipedia")
@Owner("Stas")
public class AndroidTests extends TestBase {
    SearchPage searchPage = new SearchPage();
    StackPage stackPage = new StackPage();
    ResolutionPage resolutionPage = new ResolutionPage();

    @Test
    @Severity(NORMAL)
    @DisplayName("Поиск в википедии")
    void androidSearchTest() {
        step("Выполняется поиск", () -> {
            searchPage.search();
            searchPage.send("Britney Spears");
        });
        step("Проверка результата", () -> searchPage.result());
    }

    @Test
    @Severity(CRITICAL)
    @DisplayName("Ошибка при открытии статьи")
    void openArticleTest() {

        step("Ввести запрос", () -> {
            searchPage.srcSearch();
            searchPage.srcSend("Brtney");
        });
        step("Проверка наличия контента в результатах Поиска", () -> searchPage.orgResult());
        step("Открыть первую статью", () -> stackPage.performAlpha());
        step("Отображается ошибка", () -> {
            stackPage.errorCheck();
        });
    }

    @Test
    @Severity(NORMAL)
    @DisplayName("Проверка выбора языка")
    void addLanguageRemoteTest() {
        step("Переход в action menu приложения", () -> stackPage.applicationSearch());
        step("Выбор языка", () -> {
            stackPage.exploreOverflow();
            resolutionPage.languageName("Wikipedia language");
            resolutionPage.languageTitle("Deutsch");
        });
        step("Проверка,что выбранный язык добавлен", () -> {
            resolutionPage.checkText("Deutsch");
        });
    }

    @Test
    @Severity(CRITICAL)
    @DisplayName("Ошибка при поисковом запросе")
    void checkErrorRemoteTest() {
        step("Ввод поискового запроса", () -> {
            searchPage.searchWiki();
            searchPage.sendText("Appium");
        });
        step("Переход на страницу Appium", () -> {
            stackPage.alphaPage();
        });
        step("Проверка страницы", () -> {
            stackPage.checkWiki();
            stackPage.alphaCheck("An error occurred");
        });
    }
}

