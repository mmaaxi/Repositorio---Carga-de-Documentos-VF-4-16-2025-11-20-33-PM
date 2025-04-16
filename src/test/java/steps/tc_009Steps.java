package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    tc_009Page uploadPage = new tc_009Page();
    
    @Given("I am on the upload page")
    public void i_am_on_the_upload_page() {
        uploadPage.navigateToUploadPage();
    }
    
    @When("I initiate the upload of multiple documents simultaneously")
    public void i_initiate_the_upload_of_multiple_documents_simultaneously() {
        uploadPage.initiateMultipleDocumentUpload();
    }

    @Then("the system should handle multiple requests concurrently without degradation")
    public void the_system_should_handle_multiple_requests() {
        Assert.assertTrue(uploadPage.isSystemHandlingConcurrently());
    }
    
    @Given("multiple uploads are in progress")
    public void multiple_uploads_are_in_progress() {
        Assert.assertTrue(uploadPage.areUploadsInProgress());
    }

    @When("I observe the response and loading times")
    public void i_observe_the_response_and_loading_times() {
        uploadPage.observePerformanceMetrics();
    }

    @Then("the performance should remain within the established parameters")
    public void the_performance_should_remain_within_parameters() {
        Assert.assertTrue(uploadPage.isPerformanceWithinParameters());
    }
}