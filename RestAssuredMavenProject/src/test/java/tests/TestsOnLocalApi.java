package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TestsOnLocalApi {
	
	@Test
	public void get() {
		
		baseURI = "http://localhost:3000";
		given().get("/users").then().statusCode(200).log().all();
	}
	
//	------------------------------------------------------------------------------------

	
	@Test
	public void post() {
		
		JSONObject request = new JSONObject();
		
		request.put("first_name", "Thomas");
		request.put("last_name", "Edison");
		request.put("job", "manager");
		 
		baseURI = "http://localhost:3000";
		given().contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.post("/users")
		.then().statusCode(201);
	}
	
//	------------------------------------------------------------------------------------

	
	@Test
	public void put() {
		
		JSONObject request = new JSONObject();
		
		request.put("first_name", "Albert");
		request.put("last_name", "Einstein");
		request.put("job", "Scientist");
		 
		baseURI = "http://localhost:3000";
		given().contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.put("/users/5")
		.then().statusCode(200);
	}
	
//	------------------------------------------------------------------------------------

	
	@Test
	public void patch() {
		
		JSONObject request = new JSONObject();
		
		request.put("last_name", "jai ho");
		 
		baseURI = "http://localhost:3000";
		
		given().contentType(ContentType.JSON)
			.accept(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.patch("/users/5")
		.then().statusCode(200);
	}
	
//	------------------------------------------------------------------------------------

	
	@Test
	public void delete() {
		
		
		 
		baseURI = "http://localhost:3000";
		
		given()
		.when()
			.delete("/users/5")
		.then().statusCode(200).log().all();
	}
}
