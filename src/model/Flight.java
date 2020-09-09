package model;

import java.time.LocalDate;

//Type your code 
//parent class called Flight 
public class Flight{
	private int noOfPersons;
	private int rates;
	private String classType;
	private LocalDate from;
	private LocalDate to;
	private String triptype;
	//appropriate getters and setters
	public int getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	public int getRates() {
		return rates;
	}
	public void setRates(int rates) {
		this.rates = rates;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
	}
	public String getTriptype() {
		return triptype;
	}
	public void setTriptype(String triptype) {
		this.triptype = triptype;
	}
	//constructor 
	public Flight(int noOfPersons, int rates, String classType, LocalDate from, LocalDate to, String triptype) {
		super();
		this.noOfPersons = noOfPersons;
		this.rates = rates;
		this.classType = classType;
		this.from = from;
		this.to = to;
		this.triptype = triptype;
	}
	
	
}