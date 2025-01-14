package com.patInformed.api.base;

import com.patInformed.api.models.request.SearchRequest;

import io.restassured.response.Response;

public class SearchService extends BaseService {
	private static final String BASE_PATH = "/api/";

	public Response search(SearchRequest payload) {
		return postRequest(payload, BASE_PATH + "search");
	}
}
