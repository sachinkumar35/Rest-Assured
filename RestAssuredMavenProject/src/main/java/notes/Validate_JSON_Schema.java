package notes;

/*
 * How to validate JSon Schema:-
 	> Create a JSon Schema from JSon response 
 	> Add JSon Schema in project classPath
 	> Add JSon Schema Validator dependency in in pom.xml
 	> Create a function to check response against Schema
 
 ----->>>
 	Step 1 : Create a JSON schema
 		> First we convert JSON to JSON schema through a webSite ("https://www.liquid-technologies.com/online-json-to-schema-converter");
 		> copy the JSON code and paste in webSite 
 
 	Step 2 : Add JSON schema in project class path
 		> now we have to paste that schema in target file in MAVEN project 
 		> target doesn't have any file so open in workspace
 		> create a file (schema.json) in target
 		> then paste the JSON schema in that file
 
 	Step 3 : Add MAVEN dependency for JSON schema validator
 		> search on google MAVEN Repository
 		> then search JSON schema validator and click on latest version
 		> and copy the dependency and paste in pom.xml
 		
 	Step 4 : Create a function to check response against Schema
 		> See JsonSchemaValidator class we created 
 		
 	Step 5 : Run and Validate 
 
 */
