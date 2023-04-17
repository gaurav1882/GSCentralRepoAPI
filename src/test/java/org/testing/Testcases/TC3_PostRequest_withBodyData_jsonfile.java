package org.testing.Testcases;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class TC3_PostRequest_withBodyData_jsonfile {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("../feb_api/BodyData.json"); //created the connection, relative path (..)
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr); //used for reading json file
		JSONObject j = new JSONObject(js);
		//System.out.println(j.toString());
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(j.toString())
		.when()
		.post("http://localhost:3000/APIStudentsList");
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		
		
		
		File f1 = new File("../feb_api/BodyDataVariable.json"); //created the connection, relative path (..)
		FileReader fr1 = new FileReader(f1);
		JSONTokener js1 = new JSONTokener(fr1); //used for reading json file
		JSONObject j1 = new JSONObject(js1);
		//System.out.println(j1.toString());
		
		System.out.println("Please enter the ID value");
		
		Scanner sc = new Scanner(System.in);
		String idValue=sc.next();
		
		String bodyData=j1.toString();
		bodyData = bodyData.replaceAll(Pattern.quote("{{id}}"), idValue);

		Response res1=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post("http://localhost:3000/APIStudentsList");
		System.out.println("Status code is ");
		System.out.println(res1.statusCode());



	}

}
