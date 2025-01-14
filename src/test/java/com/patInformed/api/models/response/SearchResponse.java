package com.patInformed.api.models.response;

public class SearchResponse {
	String headerDate;

	public SearchResponse() {

	}

	public SearchResponse(String headerDate) {
		super();
		this.headerDate = headerDate;
	}

	public String getHeaderDate() {
		return headerDate;
	}

	@Override
	public String toString() {
		return "SearchResponse [headerDate=" + headerDate + "]";
	}

	public void setHeaderDate(String headerDate) {
		this.headerDate = headerDate;
	}
}
