package com.ls.example.usingthreebeans;

public class Address {
	
	private int doornumber;
	private String city;
	private Family family;
	public int getDoornumber() {
		return doornumber;
	}
	public void setDoornumber(int doornumber) {
		this.doornumber = doornumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Family getFamily() {
		return family;
	}
	public void setFamily(Family family) {
		this.family = family;
	}
	@Override
	public String toString() {
		return "Address [doornumber=" + doornumber + ", city=" + city + ", family=" + family + "]";
	}

}
