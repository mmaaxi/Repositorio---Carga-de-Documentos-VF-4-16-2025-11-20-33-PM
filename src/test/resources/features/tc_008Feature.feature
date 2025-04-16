Feature: Validate database integration after uploading a document

  Scenario: Validate document data storage in the database
    Given a valid document is uploaded
    When the database is queried for the document record
    Then the database record should match the uploaded document data