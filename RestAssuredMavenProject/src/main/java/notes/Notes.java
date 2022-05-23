package notes;

/*
	Rest Assured :- 
	 	> Rest Assured is a java library for testing Restful web Services
	 	> It is used to invoke REST web services and check response
	 	> It supports POST, GET, PUT,DELETE, OPTIONS, PATH, and HEAD requestes and can be used to 
	 	validate and verify the response of these requests.
	 	> REST Assured is implemented in Groovy.
	 	
	Why API is getting Popular:
		> Testing for Core Functionality
		> Time Effective/ Quick response time
		> Language-Independent
		> Easy Integration with GUI
	 	
	Rest Assured used the BDD Style for testing.
		BDD : Behavior driven development
		we use keyword like  
					> Given
					> When 
					> then
	
	Prerequisite : 
			> java
			> IDE (Eclipse, IntelliJ, etc)
			> Maven
			> TestNg
			
	Now Create a project for Rest Assured
			Step 1 : Open Eclipse
			Step 2 : Create Maven Project
					-> click on file/new/others/maven_project/simple project/ then id ......
			Step 3 : Add dependencies in pom.xml
					-> 	<dependencies>
						 https://mvnrepository.com/artifact/io.rest-assured/rest-assured **GET DEPENDENCY FROME HERE
								example:-
									<dependency>
								    	<groupId>io.rest-assured</groupId>
								    	<artifactId>rest-assured</artifactId>
								    	<version>5.0.1</version>
								    	<scope>test</scope>
									</dependency>
									
						</dependencies>

	Note: before save the code you will not find the maven dependencies jars after saving the code you
		  will see the jars folder in package.
		  
		  	Step 4 : now Add TestNg Dependencies
		  				<!-- https://mvnrepository.com/artifact/org.testng/testng -->
								Example:-
									<dependency>
									    <groupId>org.testng</groupId>
									    <artifactId>testng</artifactId>
									    <version>7.5</version>
									    <scope>test</scope>
									</dependency>
			Step 5 : Save Project
			Step 6 : Check Library added
			Step 7 : Add TestNg PlugIn in Eclipse

-------------------------------------------------------------------------------------
day2___

	> Create a class in src/test/java





*/