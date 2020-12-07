package io.ashu.coronavirustracker.models;

public class LocationStats {
	
	private String county;
	private String province;
	private String country;
	private int lastTotalCases;
	private int diffFromPrevDay;
	
	public int getDiffFromPrevDay() {
		return diffFromPrevDay;
	}
	public void setDiffFromPrevDay(int diffFromPrevDay) {
		this.diffFromPrevDay = diffFromPrevDay;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLastTotalCases() {
		return lastTotalCases;
	}
	public void setLastTotalCases(int lastTotalCases) {
		this.lastTotalCases = lastTotalCases;
	}
	
}
