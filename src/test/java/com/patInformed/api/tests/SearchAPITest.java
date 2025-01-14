package com.patInformed.api.tests;

import org.testng.annotations.Test;

import com.patInformed.api.base.SearchService;
import com.patInformed.api.models.request.SearchRequest;
import com.patInformed.api.models.response.SearchResponse;

import io.restassured.response.Response;

public class SearchAPITest {

	@Test(description = "Verify if the Search Functionality is working fine ...")
	public void searchTest() {
		SearchService searchService = new SearchService();
		SearchRequest searchRequest = new SearchRequest("Tab");
		Response response = searchService.search(searchRequest);
//		SearchResponse searchResponse=response.as(SearchResponse.class);
//		System.out.println(searchResponse.getHeaderDate());
		System.out.println(response.asPrettyString());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusCode());
	}

}
