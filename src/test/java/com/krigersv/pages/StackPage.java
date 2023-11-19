package com.krigersv.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class StackPage {

    private final SelenideElement
            errorText = $(id("org.wikipedia.alpha:id/view_wiki_error_text")),
            menuId = $(id("org.wikipedia.alpha:id/menu_overflow_button")),
            overflow = $(id("org.wikipedia.alpha:id/explore_overflow_settings")),
            button = $(AppiumBy.id("org.wikipedia.alpha:id/view_wiki_error_button")),
            text = $(AppiumBy.id("org.wikipedia.alpha:id/view_wiki_error_text"));
    private final ElementsCollection
            alphaId = $$(id("org.wikipedia.alpha:id/page_list_item_container"));


    public StackPage performAlpha() {
        alphaId.first().click();
        return this;
    }

    public StackPage alphaPage() {
        alphaId.first().click();
        return this;
    }

    public StackPage errorCheck() {
        errorText.shouldBe(visible);
        return this;
    }

    public StackPage applicationSearch() {
        menuId.click();
        return this;
    }

    public StackPage exploreOverflow() {
        overflow.click();
        return this;
    }

    public StackPage checkWiki() {
        button.shouldBe(visible);
        return this;
    }

    public StackPage alphaCheck(String value) {
        text.shouldHave(text(value));
        return this;
    }
}