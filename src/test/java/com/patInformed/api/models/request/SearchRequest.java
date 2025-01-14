package com.patInformed.api.models.request;

public class SearchRequest {
	private String searchTerms;

	public SearchRequest(String searchData) {
		super();
		this.searchTerms = searchData;
	}

	public String getSearchData() {
		return searchTerms;
	}

	public void setSearchData(String searchData) {
		this.searchTerms = searchData;
	}

	@Override
	public String toString() {
		return "SearchRequest [searchTerms=" + searchTerms + "]";
	}

}
