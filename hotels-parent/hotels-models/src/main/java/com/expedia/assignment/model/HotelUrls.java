package com.expedia.assignment.model;

public class HotelUrls {
	private String hotelInfositeUrl;
	private String hotelSearchResultUrl;

	
	public HotelUrls(Hotel hotel, OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo,
			HotelPricingInfo hotelpricinginfo, HotelUrls hotelUrls, String hotelInfoSiteUrl,
			String hotelSearchResultUrl) {
		this.hotelInfositeUrl = hotelInfoSiteUrl;
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}

	@Override
	public String toString() {
		return "HotelUrls [hotelInfositeUrl=" + hotelInfositeUrl + ", hotelSearchResultUrl=" + hotelSearchResultUrl
				+ "]";
	}

	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}

	public void setHotelInfositeUrl(String hotelInfoSiteUrl) {
		this.hotelInfositeUrl = hotelInfoSiteUrl;
	}

	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}

	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}
}
