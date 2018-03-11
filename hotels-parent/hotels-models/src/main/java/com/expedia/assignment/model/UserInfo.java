package com.expedia.assignment.model;

import org.json.JSONObject;

public class UserInfo {
	private String userId;
	private JSONObject persona;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public JSONObject getPersona() {
		return persona;
	}

	public void setPersona(JSONObject persona) {
		this.persona = persona;
	}

}
