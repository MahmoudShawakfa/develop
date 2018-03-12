package com.expedia.assignment.model;

import java.util.Arrays;

public class OfferDateRange {

	private int[] travelStartDate;
	private int[] travelEndDate;
	private int lengthOfStay;
	private int year;
	private int month;
	private int day;

	
	
	public OfferDateRange(Hotel hotel, OfferDateRange offerDateRange, Destination destination, HotelInfo hotelInfo,
			HotelPricingInfo hotelpricinginfo, HotelUrls hotelurls, int[] travelStartDate, int[] travelEndDate,
			int lengthOfStay, int year, int month, int day) {
		this.travelStartDate = travelStartDate;
		this.travelEndDate = travelEndDate;
		this.lengthOfStay = lengthOfStay;
		this.year = year;
		this.month = month;
		this.day = day;
	}


	@Override
	public String toString() {
		return "OfferDateRange [travelStartDate=" + Arrays.toString(travelStartDate) + ", travelEndDate="
				+ Arrays.toString(travelEndDate) + ", lengthOfStay=" + lengthOfStay + ", year=" + year + ", month="
				+ month + ", day=" + day + "]";
	}

	public int[] getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(int[] travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public int[] getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(int[] travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public int getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}


}
