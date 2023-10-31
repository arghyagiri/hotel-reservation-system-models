package com.tcs.training.model.event;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum HrsEventStatus {

	FAILED("FAILED"),
	SUCCESS("SUCCESS"),
	INITIATED("INITIATED"),
	COMPLETED("COMPLETED");

	private final String name;

	public String toString() {
		return this.name;
	}

}
