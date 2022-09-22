package apiTest;

import java.io.IOException;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.response.ValidatableResponseOptions;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Put {

	@Test()
	public void putCall() {
		String apiURL = "https://reqres.in/api/users/2";
		String token = "12234";

		JSONObject payload = new JSONObject();
		payload.put("name", "morpho");
		payload.put("job", "Sr. Director");

		given().header("Content-Type", "application/json").header("Authorization", "Bearer "+token)
		.body(payload.toJSONString()).when().put("https://reqres.in/api/users/2")
		.then().statusCode(201).log().all()
		.and().statusLine("rjaa").and().assertThat().body(containsStringIgnoringCase("createdAt"));

	}

}
