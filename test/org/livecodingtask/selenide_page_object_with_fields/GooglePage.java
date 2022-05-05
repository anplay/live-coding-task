package org.livecodingtask.selenide_page_object_with_fields;

import com.codeborne.selenide.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GooglePage {
  private SelenideElement searchField = $(byName("q"));

  public void searchFor(String text) {
    searchField.val(text).pressEnter();
  }
}
