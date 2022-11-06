package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
      PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id="user")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement passWord;

    @FindBy(id="submit-form")
    public WebElement loginPage;

    @FindBy(xpath = "//span[@aria-label='Magnify icon']//*[name()='svg']")
    public WebElement magnifyButton;

    @FindBy(xpath = "//input[@class='unified-search__form-input']")
    public WebElement inputBox;

    @FindBy(xpath = "//span[@class='unified-search__result-content']/h3/span/strong")
     public WebElement seachFiles;





}