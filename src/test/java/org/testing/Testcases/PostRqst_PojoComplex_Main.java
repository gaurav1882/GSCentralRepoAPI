package org.testing.Testcases;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRqst_PojoComplex_Main {

	public static void mani(String[] args) {

		PostReq_PojoComplex_Address Address = new PostReq_PojoComplex_Address();

		Address.setH_no("551/222");
		Address.setStreet("Skyvista");
		Address.setZipcode("411067");

		PostRqst_PojoComplex_BasicInfo BasicInfo = new PostRqst_PojoComplex_BasicInfo();

		BasicInfo.setFirstname("Prashant_1");
		BasicInfo.setLastname("Sharma_1");
		BasicInfo.setId("5686767_1");
		BasicInfo.setDesignation("Vice President");
		BasicInfo.setCoursetype("SDET+JAVA+MAC");
		BasicInfo.setAddress(Address);
		
		Response Resp1 =
				given()
				.contentType(ContentType.JSON)
				.body(BasicInfo)
				.when()
				.post("http://localhost:3000/friends");
		System.out.println("Status code for POST is " + Resp1.getStatusCode() );
		System.out.println("Data posted is " );
		System.out.println(Resp1.asString());
	}
}
