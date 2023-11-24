Feature: Manage Posts in the Application

  Scenario: View a Specific Post by ID
    Given a post with ID 1 exists
    When the user requests the post by ID 1
    Then the application returns the details of the post

  Scenario: Create a New Post
    Given the user wants to create a new post
    When they provide valid post details including a unique property
    Then the application creates the post and updates the property status

  Scenario: Update an Existing Post
    Given a post with ID 2 exists
    When the user updates the post with new information
    Then the application reflects the changes in the updated post

