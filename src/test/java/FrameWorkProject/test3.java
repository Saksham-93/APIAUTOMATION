package FrameWorkProject;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class test3 {
	
	@Test
	public void getWeatherBygeography() {
		
		RestAssured.baseURI="https://samples.openweathermap.org";
		Response res=given().
		param("lat", "35").and().
		param("lon", "139").and().
		param("appid", "ab0be6fadb5afda4c76ae2a7867941f6").and().
		when().
		get("/data/2.5/weather").
		then().assertThat().statusCode(200).contentType(ContentType.JSON).and().
		extract().response();
		 String textbody=res.getBody().asString();
			
			System.out.println(textbody);
			
			JsonPath js = new JsonPath(textbody);
			
	         String condition =js.get("weather[0].main");
			
			String conditionDesc = js.getString("weather[0].description");
			
			String id = js.getString("id");
			
			String nameCountry = js.getString("name");
			
			System.out.println("The weather condition is "+condition);
			System.out.println("The description is" +conditionDesc);
			System.out.println("The name of country is" +nameCountry);
			System.out.println("The id is" +id);
		
	}

}
