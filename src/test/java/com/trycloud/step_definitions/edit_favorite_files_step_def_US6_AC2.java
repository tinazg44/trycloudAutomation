package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.EditFavoriteFilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class edit_favorite_files_step_def_US6_AC2 {

    BasePage basePage = new BasePage();
    EditFavoriteFilesPage editFavoriteFilesPage = new EditFavoriteFilesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    String verifyUploadedFileName = "";

    @When("the user clicks the add icon on the top")
    public void the_user_clicks_the_add_icon_on_the_top() {
        editFavoriteFilesPage.fileButton.click();
        editFavoriteFilesPage.addButton.click();
    }
    @When("users uploads file with the “upload file” option")
    public void users_uploads_file_with_the_upload_file_option()  {
       // wait.until(ExpectedConditions.visibilityOf(editFavoriteFilesPage.uploadFile));
        BrowserUtils.waitFor(2);
        String path ="/Users/macbook/Desktop.txt";
        verifyUploadedFileName += path;
        editFavoriteFilesPage.inputButton.sendKeys("/Users/macbook/Desktop" + path);
        BrowserUtils.waitFor(2);

       // editFavoriteFilesPage.inputButton.sendKeys(path);
        //BrowserUtils.waitFor(3);

    }
    @Then("Then verify the file is displayed on the page")
    public void then_verify_the_file_is_displayed_on_the_page() {
        //wait.until(ExpectedConditions.visibilityOf(editFavoriteFilesPage.inputFile));
        BrowserUtils.waitFor(2);
        Driver.getDriver().navigate().refresh();

        Assert.assertTrue(editFavoriteFilesPage.inputFile.isDisplayed());

    }
}
