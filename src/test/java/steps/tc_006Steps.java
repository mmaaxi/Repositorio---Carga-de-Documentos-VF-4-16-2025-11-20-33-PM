package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_006Page;

public class tc_006Steps {

    tc_006Page page = new tc_006Page();

    @Given("a user without proper authorization")
    public void user_without_proper_authorization() {
        page.navigateToLoginPage();
        page.loginAsUnauthorizedUser();
    }

    @When("the user accesses the upload functionality")
    public void the_user_accesses_the_upload_functionality() {
        boolean accessAllowed = page.accessUploadFunctionality();
        Assert.assertFalse("Access should not be allowed", accessAllowed);
    }

    @Then("the system should prevent access")
    public void the_system_should_prevent_access() {
        String alertMessage = page.getAccessDeniedMessage();
        Assert.assertEquals("Access Denied", alertMessage);
    }

    @When("the user attempts to upload a document")
    public void the_user_attempts_to_upload_a_document() {
        page.attemptDocumentUpload();
    }

    @Then("an error message indicating lack of permissions is displayed")
    public void an_error_message_indicating_lack_of_permissions_is_displayed() {
        String errorMessage = page.getErrorMessage();
        Assert.assertEquals("You do not have permission to upload documents.", errorMessage);
    }
}