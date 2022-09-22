package apiTest;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Delete {// Delete

	@Test()
	public void getDeleted() {

		String apiURL = "https://reqres.in/api/users";

	given().when().delete(apiURL).then().statusCode(200).assertThat().header("Content-Type", "application/json");

	}

}
