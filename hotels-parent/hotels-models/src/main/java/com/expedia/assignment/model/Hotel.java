package com.expedia.assignment.model;

public class Hotel{
	
	public Hotel(OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo,
			HotelPricingInfo hotelPricingInfo, HotelUrls hotelUrls) {
		this.offerDateRange = offerDateRange;
		this.destination = destination;
		this.hotelInfo = hotelInfo;
		this.hotelPricingInfo = hotelPricingInfo;
		this.hotelUrls = hotelUrls;
	}

	private OfferDateRange offerDateRange;
	private Destination destination;
	private HotelInfo hotelInfo;
	private HotelPricingInfo hotelPricingInfo;
	private HotelUrls hotelUrls;

	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	@Override
	public String toString() {
		return "Hotel [offerDateRange=" + offerDateRange + ", destination=" + destination + ", hotelInfo=" + hotelInfo
				+ ", hotelpricinginfo=" + hotelPricingInfo + ", hotelUrls=" + hotelUrls;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	public void setHotelpricinginfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public HotelUrls getHotelurls() {
		return hotelUrls;
	}

	public void setHotelurls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}
}
