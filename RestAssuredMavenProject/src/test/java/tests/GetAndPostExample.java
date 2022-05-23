package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import static org.hamcrest.CoreMatchers.*; // important to use body -> equalTo and hasItems;
import static org.hamcrest.Matcher.*;

import java.util.HashMap;
import java.util.Map;


public class GetAndPostExample {

	@Test
	public void testGet() {
		baseURI = "https://localhost:3000";
		
		given().
			get("/posts").
		then().
			statusCode(200).
			body("data[4].first_name", equalTo("George")).
			body("data.first_name", hasItems("George", "Rachel"));
	}


	@Test
	public void testPost() {
	
//	(1st Method to create a table)
		
		// for create the table
		Map<String, Object> map = new HashMap<String, Object>();
		// creating the table 
		map.put("name", "Raghav");
		map.put("job", "Teacher");
		
		System.out.println(map); // printing the value of map **It will print in simple way** ---OUTPUT--- = {name=Raghav, job=Teacher}
		
//	(2nd Method to create a table)
		
		// we added json dependency to print the value in json format like in (" ") inverted commas
		// creating the Json Object to print the value in json format
		JSONObject request = new JSONObject(map);
		
//		request.put("name", "Vaibhav");
//		request.put("job", "Teacher");
		
//		System.out.println(request); // ------O U T P U T ---- {"name":"Raghav","job":"Teacher"}
		System.out.println(request.toJSONString());
		
		
		baseURI = "https://reqres.in/api";
		
		given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON)
			.body(request.toJSONString())
		.when()
			.post("/users")
		.then()
			.statusCode(201).log().all();
		
		
	}

	
}