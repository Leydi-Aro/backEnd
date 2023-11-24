Feature: Manage Properties in the Application

  Scenario: View a Specific Property by ID
    Given a property with ID 1 exists
    When the user requests the property by ID 1
    Then the application returns the details of the property

  Scenario: Create a New Property
    Given the user wants to create a new property
    When they provide valid property details
    Then the application creates the property

  Scenario: Update an Existing Property
    Given a property with ID 2 exists
    When the user updates the property with new information
    Then the application reflects the changes in the updated property

  Scenario: Delete a Property
    Given a property with ID 3 exists
    When the user requests to delete the property by ID 3
    Then the property is removed from the application

  Scenario: Reserve a Property
    Given a property with ID 4 is available
    When the user reserves the property
    Then the property is marked as reserved for the user

  Scenario: Cancel Reservation for a Property
    Given a property with ID 5 is reserved by the user
    When the user cancels their reservation
    Then the property becomes available again

