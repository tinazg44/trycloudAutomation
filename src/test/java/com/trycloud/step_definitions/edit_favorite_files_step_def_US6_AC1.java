package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.DeleteFilePage;
import com.trycloud.pages.EditFavoriteFilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class edit_favorite_files_step_def_US6_AC1 {

    BasePage basePage = new BasePage();
    EditFavoriteFilesPage editFavoriteFilesPage = new EditFavoriteFilesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("trycloudUrl"));
        // wait.until(ExpectedConditions.visibilityOf(basePage.userName));

    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String str1, String str2) {
        basePage.userName.sendKeys(str1);
        basePage.passWord.sendKeys(str2);
        basePage.loginPage.click();

    }

    @When("the user clicks the Files module")
    public void the_user_clicks_the_files_module() {
        wait.until(ExpectedConditions.visibilityOf(editFavoriteFilesPage.fileButton));
        editFavoriteFilesPage.fileButton.click();


    }

    @When("the users click action-icon from any file on the page to remove")
    public void the_users_click_action_icon_from_any_file_on_the_page_to_remove() {
        //wait.until(ExpectedConditions.visibilityOf(editFavoriteFilesPage.iconTab));

        //editFavoriteFilesPage.iconTab.click();
        //editFavoriteFilesPage.addButton2.click();
        //editFavoriteFilesPage.iconTab.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(editFavoriteFilesPage.rightClickOnFile).perform();
    }

    @When("user choose the Remove from favorites option")
    public void user_choose_the_remove_from_favorites_option() {
        //editFavoriteFilesPage.removeFromFavorite.click();
        BrowserUtils.waitFor(1);
        if (editFavoriteFilesPage.addToFavorites.getText().equalsIgnoreCase("Add to favorites")) {
            editFavoriteFilesPage.addToFavorites.click();
            BrowserUtils.waitFor(1);
            Actions actions2 = new Actions(Driver.getDriver());
            actions2.contextClick(editFavoriteFilesPage.rightClickOnFile).perform();
            BrowserUtils.waitFor(1);
            editFavoriteFilesPage.addToFavorites.click();
        } else {
            BrowserUtils.waitFor(1);
            editFavoriteFilesPage.addToFavorites.click();
            BrowserUtils.waitFor(2);
        }
    }

    @When("user click the Favorites sub-module on the left side")
    public void user_click_the_favorites_sub_module_on_the_left_side() {
        editFavoriteFilesPage.favorites.click();
        BrowserUtils.waitFor(3);

    }

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        if (editFavoriteFilesPage.verifyNoFavorites.getText().equalsIgnoreCase("No favorites yet")) {
            Assert.assertEquals("FAILED", "No favorites yet", editFavoriteFilesPage.verifyNoFavorites.getText());
        } else {
            Assert.assertFalse(editFavoriteFilesPage.rightClickOnFile.getText().equalsIgnoreCase(editFavoriteFilesPage.verifyFavorites.getText()));
        }

            // String expectedResult = "Not favorites yet";
       // BrowserUtils.waitFor(5);
          //  Assert.assertTrue(editFavoriteFilesPage.result.isDisplayed());

        }

    }

