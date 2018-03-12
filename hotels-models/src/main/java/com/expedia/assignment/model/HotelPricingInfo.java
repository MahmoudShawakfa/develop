package com.expedia.assignment.model;

public class HotelPricingInfo {
	private double averagePriceValue;
	private double crossOutPriceValue;
	private String currency;
	private boolean drr;
	private double originalPricePerNight;
	private double percentSavings;
	private double totalPriceValue;

	
	
	public HotelPricingInfo(Hotel hotel, OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo,
			HotelPricingInfo hotelpricinginfo, HotelUrls hotelurls, double averagePriceValue, double crossOutPriceValue,
			String currency, boolean drr, double originalPricePerNight, double percentSavings, double totalPriceValue) {
		this.averagePriceValue = averagePriceValue;
		this.crossOutPriceValue = crossOutPriceValue;
		this.currency = currency;
		this.drr = drr;
		this.originalPricePerNight = originalPricePerNight;
		this.percentSavings = percentSavings;
		this.totalPriceValue = totalPriceValue;
	}

	@Override
	public String toString() {
		return "HotelPricingInfo [averagePriceValue=" + averagePriceValue + ", crossOutPriceValue=" + crossOutPriceValue
				+ ", currency=" + currency + ", drr=" + drr + ", originalPricePerNight=" + originalPricePerNight
				+ ", percentSavings=" + percentSavings + ", totalPriceValue=" + totalPriceValue + "]";
	}

	public double getAveragePriceValue() {
		return averagePriceValue;
	}

	public void setAveragePriceValue(double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	public double getCrossOutPriceValue() {
		return crossOutPriceValue;
	}

	public void setCrossOutPriceValue(double crossOutPriceValue) {
		this.crossOutPriceValue = crossOutPriceValue;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean isDrr() {
		return drr;
	}

	public void setDrr(boolean drr) {
		this.drr = drr;
	}

	public double getOriginalPricePerNight() {
		return originalPricePerNight;
	}

	public void setOriginalPricePerNight(double originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	public double getPercentSavings() {
		return percentSavings;
	}

	public void setPercentSavings(double percentSavings) {
		this.percentSavings = percentSavings;
	}

	public double getTotalPriceValue() {
		return totalPriceValue;
	}

	public void setTotalPriceValue(double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

}
