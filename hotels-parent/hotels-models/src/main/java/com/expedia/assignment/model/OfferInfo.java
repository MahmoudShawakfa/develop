package com.expedia.assignment.model;


public class OfferInfo {
private String siteID;
private String language;
private String currency;
private String userSelectedCurrency;
public String getSiteId() {
	return siteID;
}
public void setSiteId(String siteId) {
	this.siteID = siteId;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public String getUserSelectedCurrency() {
	return userSelectedCurrency;
}
public void setUserSelectedCurrency(String userSelectedCurrency) {
	this.userSelectedCurrency = userSelectedCurrency;
}


}
