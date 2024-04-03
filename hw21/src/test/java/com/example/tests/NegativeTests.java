package com.example.tests;

import com.example.model.User;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class NegativeTests {

    @BeforeSuite
    public void setUpSuite() {

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .setBaseUri("https://reqres.in")
                .build();
    }

    @Test(dataProvider = "wrongEndpointAndUserData", dataProviderClass = DataProviders.class)
    public void negativeTestCreateUser(String wrongEndpoint, String name, String job) {
        User user = new User(name, job);

        given()
                .contentType(ContentType.JSON)
                .body(user.toJson())
                .when()
                .post(wrongEndpoint)
                .then()
                .statusCode(404);
    }

    @Test(dataProvider = "nonExistingUserId", dataProviderClass = DataProviders.class)
    public void testGetNonExistingUser(int userId) {
        given()
                .pathParam("userId", userId)
                .when()
                .get("/api/users/{userId}")
                .then()
                .statusCode(404);
    }

    @Test(dataProvider = "negativeFixUserData", dataProviderClass = DataProviders.class)
    public void testUpdateNonExistingUser(int userId, String updatedName, String updatedJob) {
        User user = new User(updatedName, updatedJob);

        given()
                .pathParam("userId", userId)
                .contentType(ContentType.JSON)
                .body(user.toJson())
                .when()
                .put("/api/users/{userId}")
                .then()
                .statusCode(404);
    }

    @Test(dataProvider = "nonExistingUserId", dataProviderClass = DataProviders.class)
    public void testDeleteNonExistingUser (int userId) {
        given()
                .when()
                .delete("/api/users/" + userId)
                .then()
                .statusCode(404);
    }


}
