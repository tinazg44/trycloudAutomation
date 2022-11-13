package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.DeleteFilePage;
import com.trycloud.pages.ManageFolderPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;

public class delete_file_step_Definition_US8 {

    BasePage basePage = new BasePage();

    DeleteFilePage deleteFilePage = new DeleteFilePage();



    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        deleteFilePage.iconTab.click();

    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
       //DeleteFilePage.click();
        deleteFilePage.deleteFile.click();

    }
    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String string) {
        BrowserUtils.sleep(4);
        deleteFilePage.deletedFile.click();

    }
    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        deleteFilePage.deletedFile.isDisplayed();

    }

}
