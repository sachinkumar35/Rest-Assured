package notes;

import java.io.File;
import java.io.FileInputStream;

/*
	1. How to create and run SOAP API
	2. How to get Request Body from file
	3. How to validate XML Response
	
	Step 1: Create a Class
	Step 2: Create a function and annotate with @Test (TestNg)
	Step 3: add base URI
			> for static import of bseURI use
			import static io.restassured.RestAssured.baseURI;
			
			> (http://www.dneonline.com/calculator.asmx) this is the calculator site for testing soap 
		
	Step 4: Provide headers and body
			
			given().
				contentType("text/xml).
				header("Accept", "text/xml").
				body(requestBody)
				
		>Copy the body of calculator from add and just create a xml file in your pc by .xml and paste there
			1. Create a file with XML extension
			2. Copy the request body and save file
				> Request body :-
						<?xml version="1.0" encoding="utf-8"?>
							<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
							  <soap:Body>
							    <Add xmlns="http://tempuri.org/">
							      <intA>int</intA>
							      <intB>int</intB>
							    </Add>
							  </soap:Body>
							</soap:Envelope>

			3. Get the file in the code
				
				> FileInputStream fileInputStream = new FileInputStream(new File("./SoapRequest/Add.xml"));
				> String requestBody = IOUtils.toString(fileInputStream, "UTF-8");
				
				NOte : IOUtils comes from apache.commons
				if required get the POM Dependency 
						<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
						<dependency>
						    <groupId>commons-io</groupId>
						    <artifactId>commons-io</artifactId>
						    <version>2.11.0</version>
						</dependency>
			
			4. Add code to check file exists
					File file = new File("./SOAPRequest/add.xml");
					if(file.exists()){
						System.out.println("  >>  File exists");
						}
		
		Step 5: Send Request (POST)
			
				when.post("/calculator.asmx").
		
		Step 6: Add Expected condition | Response Validation
			then().statusCode(200).log().all();


*/