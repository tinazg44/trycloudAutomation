package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFilePage {
    public DeleteFilePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesTab;

@FindBy(xpath = "(//span[@class='icon icon-more'])[3]")
    public WebElement iconTab;

@FindBy(xpath = "(//span[contains(normalize-space(),'Delete')])[3]")
    public WebElement deleteFile;

@FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFile;

}
   /* public String filesText(int indexNumber) {
        String text = "";

        for (WebElement each : fileName) {
            if (fileName.get(indexNumber).equals(each)) {
                text = each.getText();
            }
        }

        return text;
    }
*/