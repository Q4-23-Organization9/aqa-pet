Feature: Create User

  Scenario Outline: Positive Test
    Given request specification configured with 'https://reqres.in/' URI
    When I send a POST request to create the user with <name> name and <job> job
    Then I should receive 201 status code
    And the response body should contain user details <name> name and <job> job

    Examples:
      | name    | job       |
      | Olha    | AQA       |
      | John    | Developer |


  Scenario Outline: Negative Test
    Given request specification configured with 'https://reqres.in/' URI
    When I send a POST request with <name> name, <job> job and  <wrongEndpoint> wrong endpoint
    Then I will receive 404 status code

    Examples:
      | name      | job      |wrongEndpoint |
      | UserName1 | UserJob1 |api/users123  |
      | UserName2 | UserJob2 |api/us        |
      | UserName3 | UserJob3 |api/us%#*     |
      | UserName4 | UserJob4 |api/*         |