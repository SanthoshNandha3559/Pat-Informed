package com.patInformed.api.base;

import static io.restassured.RestAssured.*;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
	private static final String BASE_URL = "https://backend.patinformed.globaldb.prd.web1.wipo.int";
	private RequestSpecification reqSpecification;

	public BaseService() {
		reqSpecification = given().baseUri(BASE_URL);
	}

	protected Response postRequest(Object payload, String endPoint) {
		return reqSpecification.contentType("application/json").body(payload).post(endPoint);
	}

}
