package FrameWorkProject;

import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

public class test1 {
	
	
	@Test
	public void getWeatherbyCityName() {
		
		RestAssured.baseURI="https://samples.openweathermap.org";
		
		Response res=given().
		param("q", "Manchester").and().
		param("appid", "ab0be6fadb5afda4c76ae2a7867941f6").and().
		when().
		get("/data/2.5/weather").
		then().assertThat().statusCode(200).contentType(ContentType.JSON).
		extract().response();
		
		String textbody=res.getBody().asString();
		
		System.out.println(textbody);
		
		JsonPath js = new JsonPath(textbody);
		
		String condition =js.get("weather[0].main");
		
		String conditionDesc = js.getString("weather[0].description");
		
		System.out.println("The weather condition is "+condition);
		System.out.println("The description is" +conditionDesc);
		
}

}
