package com.krigersv.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchPage {
    private final SelenideElement
            fragment = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
            search = $(accessibilityId("Search Wikipedia")),
            text = $(id("org.wikipedia.alpha:id/search_src_text"));

    private final ElementsCollection

            page_list = $$(id("org.wikipedia.alpha:id/page_list_item_title")),
            list = $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"));

    public SearchPage performSearch() {
        search.click();
        return this;
    }

    public SearchPage search() {
        search.click();
        return this;
    }

    public SearchPage srcSearch() {
        search.click();
        return this;
    }

    public SearchPage searchWiki() {
        search.click();
        return this;
    }

    public SearchPage sendSearch(String searchText) {
        text.sendKeys(searchText);
        return this;
    }

    public SearchPage srcSend(String searchText) {
        text.sendKeys(searchText);
        return this;
    }

    public SearchPage send(String searchText) {
        text.sendKeys(searchText);
        return this;
    }

    public SearchPage sendText(String searchText) {
        text.sendKeys(searchText);
        return this;
    }

    public SearchPage checkingResult() {
        page_list.shouldHave(sizeGreaterThan(0));
        return this;
    }

    public SearchPage orgResult() {
        page_list.shouldHave(sizeGreaterThan(0));
        return this;
    }

    public SearchPage result() {
        page_list.shouldHave(sizeGreaterThan(0));
        return this;
    }

    public SearchPage openArticle() {
        list.first().click();
        return this;
    }

    public SearchPage skipOnboarding() {
        fragment.click();
        return this;
    }

}
