package FrameWorkProject;

public class Payload {
	
	public static String getData() {
		
		String myData ="{\r\n" + 
				"    \"external_id\": \"SF_TEST001\",\r\n" + 
				"    \"name\": \"San Francisco Test Station\",\r\n" + 
				"    \"latitude\": 37.76,\r\n" + 
				"    \"longitude\": -122.43,\r\n" + 
				"    \"altitude\": 150\r\n" + 
				"}";
		return myData;
	}
	
	public static String getMeasurementData() {
		
		String measureData="[\r\n" + 
				"  {\r\n" + 
				"    \"station_id\": \"583436dd9643a9000196b8d6\",\r\n" + 
				"    \"dt\": 1479817340,\r\n" + 
				"    \"temperature\": 18.7,\r\n" + 
				"    \"wind_speed\": 1.2,\r\n" + 
				"    \"wind_gust\": 3.4,\r\n" + 
				"    \"pressure\": 1021,\r\n" + 
				"    \"humidity\": 87,\r\n" + 
				"    \"rain_1h\": 2,\r\n" + 
				"    \"clouds\": [\r\n" + 
				"        {\r\n" + 
				"            \"condition\": \"NSC\"\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"  }\r\n" + 
				"]";
		return measureData;
	}

}
