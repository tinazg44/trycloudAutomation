package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.Set;

public class EditFavoriteFilesPage {

    public EditFavoriteFilesPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "li[data-id='files'] > a > svg > image")
    public WebElement fileButton;

    @FindBy(xpath = "(//span[@class='icon icon-more'])[2]")
    public WebElement iconTab;

//(//span[@class='icon icon-more'])[2]
    ////tr[1]/td[2]/a/span[2]/a[2]/span[1]

    @FindBy (xpath = "//*[@id='rightClickMenu']/ul/li[1]")
    public WebElement addToFavorites;

    @FindBy(xpath = "(//li[@class=' action-favorite-container'])/a/span[2]")
    public WebElement removeFromFavorite;
//(//li[@class=' action-favorite-container'])/a/span[2]
    ////*[@id='rightClickMenu']/ul/li[1]

    @FindBy(xpath = "//span[.='Add to favorites']")
    public WebElement addButton2;

    @FindBy(xpath = "//li[@data-id='favorites']")
    public WebElement favorites;

    @FindBy (xpath = "//*[@id='fileList']/tr/td[1]/a/span[1]/span[1]")
    public WebElement verifyFavorites;



    @FindBy (xpath = "(//span[@class='nametext'])[1]")
    public WebElement rightClickOnFile;

    @FindBy(xpath = "//h2[normalize-space()='No favorites yet']")
    public WebElement verifyNoFavorites;

    //TC2

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement addButton;

    @FindBy(xpath = "//label[@data-action='upload']")
    public WebElement uploadFile;

    @FindBy (xpath = "//input[@type ='file']")
    public WebElement inputButton;

    @FindBy (css= "#uploadprocessbar")
    public WebElement uploadBar;

    //@FindBy(xpath = "//span[starts-with(text(),'purple-osteospermum-daisy')]")
   // public WebElement inputFile;
    @FindBy(xpath = "(//span[@class='innernametext'])[1]")
    public WebElement inputFile;

    @FindBy (xpath = "//tbody[@id='fileList']/tr")
    public Set<WebElement> recommendBtn;

    @FindBy (xpath = "//span[@class='nametext']")
    public Set<WebElement> uploadedFileList;

   // public Set<String> fileCount(){
      //  int count = 0;
       // Set<String> fileList = new ArrayList<>();
      //  for(int i = 0; i< recommendBtn.size(); i++) {
        //    BrowserUtils.hover(recommendBtn.get(i));
        //    recommendBtn.get(i).isEnabled();
            //count++;
         //   fileList.add(recommendBtn.get(i).getAttribute("data-file"));
       // }
      //  return fileList;
  //  }



}
