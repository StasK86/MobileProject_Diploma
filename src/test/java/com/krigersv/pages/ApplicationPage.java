package com.krigersv.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class ApplicationPage {

    private final SelenideElement
            alpha = $(id("org.wikipedia.alpha:id/secondaryTextView")),
            button = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            checkingAlpha = $(id("org.wikipedia.alpha:id/primaryTextView")),
            fragment = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            primaryText = $(id("org.wikipedia.alpha:id/primaryTextView")),
            forward = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
            explore = $(id("org.wikipedia.alpha:id/primaryTextView"));

    public ApplicationPage checkingFirst(String value) {
        alpha.shouldHave(text(value));
        return this;
    }

    public ApplicationPage checkSecond() {
        button.click();
        return this;
    }

    public ApplicationPage checkingSecond(String value) {
        checkingAlpha.shouldHave(text(value));
        return this;
    }

    public ApplicationPage goThird() {
        fragment.click();
        return this;
    }

    public ApplicationPage checkingThird(String value) {
        primaryText.shouldHave(text(value));
        return this;
    }

    public ApplicationPage goFour() {
        forward.click();
        return this;
    }

    public ApplicationPage checkingFour(String value) {
        explore.shouldHave(text(value));
        return this;
    }
}

