package com.krigersv.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class ImageryPage {

    private final SelenideElement
            header_image = $(AppiumBy.id("org.wikipedia.alpha:id/view_page_header_image"));

    public ImageryPage checkImage() {
        header_image.shouldBe(visible);
        return this;
    }
}
