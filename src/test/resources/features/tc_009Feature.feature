Feature: Evaluate performance during multiple simultaneous uploads

  Scenario: System handles multiple concurrent requests without degradation
    Given I am on the upload page
    When I initiate the upload of multiple documents simultaneously
    Then the system should handle multiple requests concurrently without degradation

  Scenario: Performance remains within established parameters
    Given multiple uploads are in progress
    When I observe the response and loading times
    Then the performance should remain within the established parameters