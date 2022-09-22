package apiTest;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Get { // Read

	@Test
	public void GetCall() {

		String apiURL = "https://swapi.dev/api/people/1/";

		// equal to - single matcher
		// has items - multiple matchers
		given().get(apiURL).then().statusCode(200).body("name", equalTo("Luke Skywalker"))
				.body("films", hasItems("https://swapi.dev/api/films/1/", "https://swapi.dev/api/films/6/")).and().log()
				.body();

		System.out.println("Successfully executed Test->'GETRestAssured'");
	}

}
