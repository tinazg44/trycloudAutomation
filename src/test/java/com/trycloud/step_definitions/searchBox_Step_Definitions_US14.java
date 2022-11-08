package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class searchBox_Step_Definitions_US14 {
    BasePage basePage=new BasePage();


    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
    basePage.magnifyButton.click();
    }
    @When("users search any existing file folder user name")
    public void users_search_any_existing_file_folder_user_name() {
    basePage.inputBox.sendKeys("new folder");

    }
    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {

       String expectedSearchResult = "new folder";
        Assert.assertEquals(expectedSearchResult,basePage.seachFiles.getText());
 //test
    }


}
