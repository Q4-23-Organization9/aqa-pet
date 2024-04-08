package org.example.stepdeffs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.model.User;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;


public class CreateUserStepDefinitions {


    private String name;
    private String job;
    private ValidatableResponse response;
    private RequestSpecification spec;


    @Given("request specification configured with {string} URI")
    public void request_specification_configured(String baseUri) {

        spec = new RequestSpecBuilder()
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .setBaseUri(baseUri)
                .build();

    }

    @When("^I send a POST request to create the user with (.*) name and (.*) job$")
    public void i_send_a_post_request_to_create_the_user(String name, String job) {
        User user = new User(name, job);

        response = given()
                .spec(spec)
                .contentType(ContentType.JSON)
                .body(user.toJson())
                .when()
                .post("api/users")
                .then()
                .extract().response().then()
                .assertThat();
    }
    @When("^I send a POST request with (.*) name, (.*) job and  (.*) wrong endpoint$")
    public void i_send_a_post_request_with_wrong_endpoint(String name, String job, String wrongEndpoint) {
        User user = new User(name, job);

        response = given()
                .spec(spec)
                .contentType(ContentType.JSON)
                .body(user.toJson())
                .when()
                .post(wrongEndpoint)
                .then()
                .extract().response().then()
                .assertThat();
    }


    @Then("I should receive 201 status code")
    public void I_should_receive_201_status_code() {
        response.statusCode(201);
    }
    @Then("I will receive 404 status code")
    public void I_will_receive_404_status_code() {
        response.statusCode(404);
    }
    @Then("^the response body should contain user details (.*) name and (.*) job$")
    public void the_response_body_should_contain_user_details(String name, String job) {
        response
                .body("name", equalTo(name))
                .body("job", equalTo(job))
                .body("id", notNullValue())
                .body("createdAt", notNullValue());;
    }

}
