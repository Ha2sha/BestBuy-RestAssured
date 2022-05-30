package com.bestbuy.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBaseUtilites {

    @BeforeClass
    public static void inIt() {
        //set environment
        RestAssured.baseURI="http://localhost";//test environment
        RestAssured.port=3030;


    }
}
