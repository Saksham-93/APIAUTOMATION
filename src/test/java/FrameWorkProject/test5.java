package FrameWorkProject;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test5 {
	
	@Test
	public void addMeasurements() {
		
		RestAssured.baseURI="https://samples.openweathermap.org";
		
		Response res=given().
		queryParam("appid", "ab0be6fadb5afda4c76ae2a7867941f6").and().
		body(Payload.getMeasurementData()).
		when().
		post("/data/3.0/stations").
		then().assertThat().statusCode(204).
		extract().response();
		
		String textbody=res.getBody().asString();
		
		System.out.println(textbody);
	}

}
