package com.expedia.assignment.filter;

import java.io.IOException;
import java.util.ArrayList;

import com.expedia.assignment.CreateRequest;
import com.expedia.assignment.RequestParams;

public class RequestFilter {

	public static String requestFilter(ArrayList<String> paramNames) {

		String params = "";
		for (String param : paramNames) {
			if (param != null)
				params += "&" + param;
		}

			String request = CreateRequest.createInitialRequest(RequestParams.BASE_URL + params);
			return request;
	}
}