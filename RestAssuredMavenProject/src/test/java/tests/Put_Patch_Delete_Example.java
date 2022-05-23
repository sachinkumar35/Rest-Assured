package tests;

import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.CoreMatchers.*;
import org.testng.annotations.Test;

public class Put_Patch_Delete_Example {
	
//	***** Put *****
	
	@Test
	public void testPut() {
		JSONObject request = new JSONObject();

		request.put("name", "Raghav");
		request.put("job", "Teacher");

		System.out.println(request.toJSONString());

		baseURI = "https://reqres.in/api";

		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.put("/users/2")
		.then()
			.statusCode(200).log().all();

		given().get("/users/2").then().statusCode(200).log().all(); // to print the details of id 2

	}

//	***** Patch ****
	
	@Test
	public void testPatch() {
		
		JSONObject request = new JSONObject();

		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request.toJSONString());

		baseURI = "https://reqres.in/api";

		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.patch("/users/2")
		.then()
			.statusCode(200).log().all();
	}

// ***** Delete *****	
	
	@Test
	public void testDelete() {
		
		baseURI = "https://reqres.in/api";

		when()
			.delete("/users/2")
		.then()
			.statusCode(204).log().all();

	}
}