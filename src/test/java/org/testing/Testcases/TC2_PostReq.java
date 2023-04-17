package org.testing.Testcases;
import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
public class TC2_PostReq 
{
	public static void main(String[] args) {
		JSONObject inner1 = new JSONObject();
		inner1.put("Ward no", "145");
		inner1.put("houseno", "551/234");
		inner1.put("street", "porwal_road");
		inner1.put("addresstype", "primaryAddress");
		
		JSONObject inner2 = new JSONObject();
		inner2.put("Ward no", "541");
		inner2.put("houseno", "234/551");
		inner2.put("street", "Avenue_street");
		inner2.put("addresstype", "secondaryAddress");
		
		JSONArray array = new JSONArray();//Array for both inner Json objects
		array.put(0, inner1);
		array.put(1, inner2);
		
		JSONObject outer = new JSONObject();
		outer.put("firstname", "raghav");
		outer.put("lastname", "chinnaswamy");
		outer.put("id", "599999");
		outer.put("designation", "VicePresident");
		outer.put("coursetype", "AWS+JSW+JS");
		outer.put("Address", array);//Passing array instance here

		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(outer.toString())
				.when()
				.post("http://localhost:3000/APIStudentsList");
		System.out.println("Status code is : " + res.statusCode());
	}
}
