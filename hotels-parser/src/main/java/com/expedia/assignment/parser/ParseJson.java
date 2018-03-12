package com.expedia.assignment.parser;

import java.io.IOException;
import java.io.StringReader;

import com.expedia.assignment.CreateRequest;
import com.expedia.assignment.RequestParams;
import com.expedia.assignment.exceptions.InvalidJsonFormatException;
import com.expedia.assignment.model.JSONRoot;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class ParseJson {
	String jsonFromRequest;

	public ParseJson(String jsonFromRequest) {
		super();
		this.jsonFromRequest = jsonFromRequest;
	}

	public JSONRoot parse() {
			return new Gson().fromJson(new JsonReader(new StringReader(jsonFromRequest)), JSONRoot.class);
	}
}
