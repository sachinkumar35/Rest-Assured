package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
 
// add imports ********************************
import static org.hamcrest.CoreMatchers.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matcher.*;
//*********************************************

public class TestOne {
	@Test
	public void test_1(){
		Response response = RestAssured.get("http://reqres.in/api/users?page=2");
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));	
		System.out.println(response.getCookies());
	
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
	}
	@Test
	public void test_2() { 	
		
		baseURI = "http://reqres.in"; // this is storing the domain
		
		given().
			get("/api/users?page=2").
		then().
			statusCode(200).
			body("data[1].id",equalTo(8)).log().all();
					// log().all() print the all json code in console 
	}
	
}
