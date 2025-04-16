Feature: Validate security for unauthorized document upload

  Scenario: Attempt to upload a document without authorization
    Given a user without proper authorization
    When the user accesses the upload functionality
    Then the system should prevent access
    When the user attempts to upload a document
    Then an error message indicating lack of permissions is displayed