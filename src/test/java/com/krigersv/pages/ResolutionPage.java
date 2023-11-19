package com.krigersv.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class ResolutionPage {
    private final SelenideElement

            container = $(id("org.wikipedia.alpha:id/main_drawer_settings_container")),
            menuSearch = $(id("org.wikipedia.alpha:id/menu_icon")),
            drawer = $(id("org.wikipedia.alpha:id/main_drawer_login_button"));
    private final ElementsCollection

            language = $$(AppiumBy.className("android.widget.TextView")),
            locution = $$(id("org.wikipedia.alpha:id/localized_language_name"));

    public ResolutionPage menuSearch() {
        menuSearch.click();
        return this;
    }

    public ResolutionPage login() {
        menuSearch.click();
        return this;
    }

    public ResolutionPage drawer() {
        drawer.click();
        return this;
    }

    public ResolutionPage containerSearch() {
        container.click();
        return this;
    }

    public ResolutionPage language(String value) {
        language.findBy(text(value)).click();
        return this;
    }

    public ResolutionPage languageName(String value) {
        language.findBy(text(value)).click();
        return this;
    }

    public ResolutionPage choiceLanguage(String value) {
        language.findBy(text(value)).click();
        return this;
    }

    public ResolutionPage locution(String value) {
        locution.findBy(text(value)).click();
        return this;
    }

    public ResolutionPage languageTitle(String value) {
        locution.findBy(text(value)).click();
        return this;
    }

    public ResolutionPage checkLanguage(String value) {
        language.findBy(text(value)).shouldBe(visible);
        return this;
    }

    public ResolutionPage checkVerify(String value) {
        language.findBy(text(value)).shouldBe(visible);
        return this;
    }

    public ResolutionPage checkText(String value) {
        language.findBy(text(value)).shouldBe(visible);
        return this;
    }
}
