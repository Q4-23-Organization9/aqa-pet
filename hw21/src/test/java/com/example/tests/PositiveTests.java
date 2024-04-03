package com.example.tests;

import com.example.model.User;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;

public class PositiveTests {

    @BeforeSuite
    public void setUpSuite() {

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .setBaseUri("https://reqres.in")
                .build();
    }

    @Test(dataProvider = "userData", dataProviderClass = DataProviders.class)
    public void testCreateUser(String name, String job) {
        User user = new User(name, job);

        given()
                .contentType(ContentType.JSON)
                .body(user.toJson())
                .when()
                .post("/api/users")
                .then()
                .assertThat()
                .statusCode(201)
                .body("name", equalTo(name))
                .body("job", equalTo(job))
                .body("id", notNullValue())
                .body("createdAt", notNullValue());
    }

    @Test(dataProvider = "positiveUserData", dataProviderClass = DataProviders.class)
    public void testGetExistingUser(int userId) {
        given()
                .pathParam("userId", userId)
                .when()
                .get("/api/users/{userId}")
                .then()
                .assertThat()
                .statusCode(200)
                .body("data.id", equalTo(userId));
    }

    @Test(dataProvider = "positiveFixUserData", dataProviderClass = DataProviders.class)
    public void testUpdateUser(int userId, String updatedName, String updatedJob) {
        User user = new User(updatedName, updatedJob);

        given()
                .pathParam("userId", userId)
                .contentType(ContentType.JSON)
                .body(user.toJson())
                .when()
                .put("/api/users/{userId}")
                .then()
                .assertThat()
                .statusCode(200)
                .body("name", equalTo(updatedName))
                .body("job", equalTo(updatedJob))
                .body("updatedAt", startsWith(getCurrentDate()));
    }
    private String getCurrentDate() {

        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return currentDate.format(formatter);

    }

    @Test(dataProvider = "positiveUserData", dataProviderClass = DataProviders.class)
    public void positiveDeleteUser (int userId) {
        given()
                .when()
                .delete("/api/users/" + userId)
                .then()
                .statusCode(204);
    }

}
