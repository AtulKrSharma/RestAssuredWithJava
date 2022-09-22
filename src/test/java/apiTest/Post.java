package apiTest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.hamcrest.core.StringContains;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Post {// create

	@Test()
	public void postData() {
		String apiURL = "https://reqres.in/api/users";

		JSONObject req = new JSONObject();
		req.put("name", "Atul");
		req.put("job", "QALeads");
				
		given().contentType("application/json").body(req.toJSONString()).when().post(apiURL).then()
		.statusCode(200).assertThat().and().header("Content-Type", "application/json");

	}

}
