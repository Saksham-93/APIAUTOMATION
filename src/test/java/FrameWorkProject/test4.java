package FrameWorkProject;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

import io.restassured.response.Response;
import FrameWorkProject.Payload;

public class test4 {
	
	@Test
	public void createTestStation() {
		
		RestAssured.baseURI="https://samples.openweathermap.org";
		
		Response res=given().
		queryParam("appid", "ab0be6fadb5afda4c76ae2a7867941f6").and().
		body(Payload.getData()).
		when().
		post("/data/3.0/stations").
		then().assertThat().statusCode(201).
		extract().response();
		
		String textbody=res.getBody().asString();
		
		System.out.println(textbody);
		
		
		
	}

}
