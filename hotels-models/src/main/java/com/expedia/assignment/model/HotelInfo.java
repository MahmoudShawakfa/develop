package com.expedia.assignment.model;

public class HotelInfo {
	private String hotelId;
	private String hotelName;
	private String hotelCity;
	private String hotelCountryCode;
	private String hotelDestination;
	private String hotelDestinationRegionID;
	private double hotelGuestReviewRating;
	private String hotelImageUrl;
	private double hotelLatitude;
	private String hotelLongDestination;
	private double hotelLongitude;
	private String hotelProvince;
	private int hotelReviewTotal;
	private String hotelStarRating;
	private String hotelStreetAddress;
	private boolean isOfficialRating;
	private String localizedHotelName;
	private boolean vipAccess;

	public HotelInfo(Hotel hotel, OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo,
			HotelPricingInfo hotelpricinginfo, HotelUrls hotelurls, String hotelId, String hotelName, String hotelCity,
			String hotelCountryCode, String hotelDestination, String hotelDestinationRegionID,
			double hotelGuestReviewRating, String hotelImageUrl, double hotelLatitude, String hotelLongDestination,
			double hotelLongitude, String hotelProvince, int hotelReviewTotal, String hotelStarRating,
			String hotelStreetAddress, boolean isOfficialRating, String localizedHotelName, boolean vipAccess) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelCountryCode = hotelCountryCode;
		this.hotelDestination = hotelDestination;
		this.hotelDestinationRegionID = hotelDestinationRegionID;
		this.hotelGuestReviewRating = hotelGuestReviewRating;
		this.hotelImageUrl = hotelImageUrl;
		this.hotelLatitude = hotelLatitude;
		this.hotelLongDestination = hotelLongDestination;
		this.hotelLongitude = hotelLongitude;
		this.hotelProvince = hotelProvince;
		this.hotelReviewTotal = hotelReviewTotal;
		this.hotelStarRating = hotelStarRating;
		this.hotelStreetAddress = hotelStreetAddress;
		this.isOfficialRating = isOfficialRating;
		this.localizedHotelName = localizedHotelName;
		this.vipAccess = vipAccess;
	}

	@Override
	public String toString() {
		return "HotelInfo [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelCity=" + hotelCity
				+ ", hotelCountryCode=" + hotelCountryCode + ", hotelDestination=" + hotelDestination
				+ ", hotelDestinationRegionID=" + hotelDestinationRegionID + ", hotelGuestReviewRating="
				+ hotelGuestReviewRating + ", hotelImageUrl=" + hotelImageUrl + ", hotelLatitude=" + hotelLatitude
				+ ", hotelLongDestination=" + hotelLongDestination + ", hotelLongitude=" + hotelLongitude
				+ ", hotelProvince=" + hotelProvince + ", hotelReviewTotal=" + hotelReviewTotal + ", hotelStarRating="
				+ hotelStarRating + ", hotelStreetAddress=" + hotelStreetAddress + ", isOfficialRating="
				+ isOfficialRating + ", localizedHotelName=" + localizedHotelName + ", vipAccess=" + vipAccess + "]";
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	public String getHotelDestination() {
		return hotelDestination;
	}

	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	public String getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	public double getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	public void setHotelGuestReviewRating(double hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	public double getHotelLatitude() {
		return hotelLatitude;
	}

	public void setHotelLatitude(double hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	public double getHotelLongitude() {
		return hotelLongitude;
	}

	public void setHotelLongitude(double hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	public String getHotelProvince() {
		return hotelProvince;
	}

	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	public int getHotelReviewTotal() {
		return hotelReviewTotal;
	}

	public void setHotelReviewTotal(int hotelReviewTotal) {
		this.hotelReviewTotal = hotelReviewTotal;
	}

	public String getHotelStarRating() {
		return hotelStarRating;
	}

	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
	}

	public boolean isOfficialRating() {
		return isOfficialRating;
	}

	public void setOfficialRating(boolean isOfficialRating) {
		this.isOfficialRating = isOfficialRating;
	}

	public String getLocalizedHotelName() {
		return localizedHotelName;
	}

	public void setLocalizedHotelName(String localizedHotelName) {
		this.localizedHotelName = localizedHotelName;
	}

	public boolean isVipAccess() {
		return vipAccess;
	}

	public void setVipAccess(boolean vipAccess) {
		this.vipAccess = vipAccess;
	}

}
