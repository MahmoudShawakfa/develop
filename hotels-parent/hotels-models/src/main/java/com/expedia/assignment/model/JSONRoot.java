package com.expedia.assignment.model;




public class JSONRoot {
	OfferInfo offerInfo;
	UserInfo userInfo;
	Offers offers;

	public JSONRoot(OfferInfo offerInfo, UserInfo userInfo, Offers offers) {
		this.offerInfo = offerInfo;
		this.userInfo = userInfo;
		this.offers = offers;
	}

	@Override
	public String toString() {
		return "JSONRoot [offerInfo=" + offerInfo + ", userInfo=" + userInfo + ", offers=" + offers + "]";
	}

	public OfferInfo getOfferInfo() {
		return offerInfo;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Offers getOffers() {
		return offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}
}
