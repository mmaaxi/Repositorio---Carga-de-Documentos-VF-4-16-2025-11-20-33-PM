package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_008Page;
import org.junit.Assert;

public class tc_008Steps {

    tc_008Page documentPage = new tc_008Page();

    @Given("a valid document is uploaded")
    public void aValidDocumentIsUploaded() {
        documentPage.navigateToUploadPage();
        documentPage.uploadValidDocument();
    }

    @When("the database is queried for the document record")
    public void theDatabaseIsQueriedForTheDocumentRecord() {
        documentPage.queryDatabaseForDocument();
    }

    @Then("the database record should match the uploaded document data")
    public void theDatabaseRecordShouldMatchTheUploadedDocumentData() {
        String expectedData = documentPage.getUploadedDocumentData();
        String actualData = documentPage.getDatabaseRecordData();
        Assert.assertEquals("The database record does not match the uploaded document.", expectedData, actualData);
    }
}