package com.clement.eventtracker.dto;

import com.clement.eventtracker.object.TVStatus;

public class CreditResult {

	private String content;

	private TVStatus status;

	public CreditResult(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setStatus(TVStatus status) {
		this.status = status;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public TVStatus getStatus() {
		return status;
	}
}