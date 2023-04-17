package org.testing.Testcases;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {
	
	public static void main(String [] args) {
		
	POJO_PostReq data = new POJO_PostReq();
	data.setFirstname("Gaurav_3");
	data.setLastname("Srivastava_3");
	data.setId("54389_3");
	data.setDesignation("Ass_Manager_3");
	data.setCoursetype("SDET_FULLSTACK_3");

	
			Response Resp= 
			given()
			.contentType(ContentType.JSON)
			.body(data)
			.when()
			.post("http://localhost:3000/APIStudentsList");
			
			System.out.println("Status code for POST is " + Resp.getStatusCode() );
			System.out.println("Data posted is " );
			System.out.println(Resp.asString());
	}
}
