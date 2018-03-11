package com.expedia.assignment.model;

import java.util.List;

public class Offers {
	private List<Hotel> Hotel;

	public Offers(List<Hotel> hotel) {
		this.Hotel = hotel;
	}

	@Override
	public String toString() {
		return "Offers [hotel=" + Hotel + "]";
	}

	public List<Hotel> getHotel() {
		return Hotel;
	}

	public void setHotel(List<Hotel> hotel) {
		this.Hotel = hotel;
	}

}
