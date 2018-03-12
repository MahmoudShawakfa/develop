package com.expedia.assignment.RequestTest;

import com.expedia.assignment.CreateRequest;
import com.expedia.assignment.InvalidResponseException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert.*;
import java.io.IOException;
import java.net.MalformedURLException;

public class RequestTest {
    @Test
    public void Should_RightURLBeSentAJSONObjectShouldReturn(){
        String initialRequest = CreateRequest.createInitialRequest("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel");
        JSONObject jsonObject = new JSONObject(initialRequest);
        Assert.assertNotNull(jsonObject);
    }
    public void Should_RightURLBeSentWithAcceptableParamsAJSONObjectShouldReturn(){
        String initialRequest = CreateRequest.createInitialRequest("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationCity=miami");
        JSONObject jsonObject = new JSONObject(initialRequest);
        Assert.assertNotNull(jsonObject);
    }
}