package com.bestbuy.utilitiesinfo;

import com.bestbuy.testbase.TestBaseUtilites;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class UtilitiesGetTest extends TestBaseUtilites {


    @Test
    public void getVersion() {
        Response response = given()
                .when()
                .get("/version");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getHealthCheck() {
        Response response = given()
                .when()
                .get("/healthcheck");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
