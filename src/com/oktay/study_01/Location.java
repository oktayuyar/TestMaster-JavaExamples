package com.oktay.study_01;

public class Location {
	
	private double lat;
	private double longi;
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLongi() {
		return longi;
	}
	public void setLongi(double longi) {
		this.longi = longi;
	}
	
	public Location() {
		super();
		longi=41.082266 ;
		lat=37.628794;
	}
	
	public void moveTreasure(double latt, double longitute){
		longi=latt;
		lat=longitute;
	}

	@Override
	public String toString() {
		return "Location [lat=" + lat + ", longi=" + longi + "]";
	}
	
}
