package com.expedia.assignment.model;

public class Destination{
	private String regionID;
	private String associatedMultiCityRegionId;
	private String city;
	private String country;
	private String longName;
	private String nonLocalizedCity;
	private String province;
	private String shortName;
	private String tla;

	
	public Destination(Hotel hotel, OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo,
			HotelPricingInfo hotelpricinginfo, HotelUrls hotelurls, String regionId, String associatedMultiCityRegionId,
			String city, String country, String longName, String nonLocalizedCity, String province, String shortName,
			String tla) {
		this.regionID = regionId;
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
		this.city = city;
		this.country = country;
		this.longName = longName;
		this.nonLocalizedCity = nonLocalizedCity;
		this.province = province;
		this.shortName = shortName;
		this.tla = tla;
	}

	@Override
	public String toString() {
		return "Destination [regionId=" + regionID + ", associatedMultiCityRegionId=" + associatedMultiCityRegionId
				+ ", city=" + city + ", country=" + country + ", longName=" + longName + ", nonLocalizedCity="
				+ nonLocalizedCity + ", province=" + province + ", shortName=" + shortName + ", tla=" + tla + "]";
	}

	public String getRegionId() {
		return regionID;
	}

	public void setRegionId(String regionId) {
		this.regionID = regionId;
	}

	public String getAssociatedMultiCityRegionId() {
		return associatedMultiCityRegionId;
	}

	public void setAssociatedMultiCityRegionId(String associatedMultiCityRegionId) {
		this.associatedMultiCityRegionId = associatedMultiCityRegionId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLongName() {
		return longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getNonLocalizedCity() {
		return nonLocalizedCity;
	}

	public void setNonLocalizedCity(String nonLocalizedCity) {
		this.nonLocalizedCity = nonLocalizedCity;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getTla() {
		return tla;
	}

	public void setTla(String tla) {
		this.tla = tla;
	}

}
