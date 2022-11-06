package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.ManageFolderPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.FileInputStream;

public class manage_folders_step_Definitions_US7AC2 {


    BasePage basePage =new BasePage();

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);


    ManageFolderPage manageFolderPage = new ManageFolderPage();

    Actions actions = new Actions(Driver.getDriver());









    @When("the user uploads a file with the upload file option")
    public void theUserUploadsAFileWithTheUploadFileOption() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(manageFolderPage.uploadFile));
        String path="/Users/Alen/Desktop/eminem_photo_by_dave_j_hogan_getty_images_entertainment_getty_187596325.jpg";
        manageFolderPage.uploadFile.click();


      actions.sendKeys(path);


   //     manageFolderPage.uploadFile.sendKeys(path);





    }

    @Then("Verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
    }




}
