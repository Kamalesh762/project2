package com.example.demo.modeldetails;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name="hello")
public class modelO 
{
	@Id 
	private int id;
   private int Travelnum;
   private String Travelname;
   private String Travelversion;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTravelnum() {
	return Travelnum;
}
public void setTravelnum(int travelnum) {
	Travelnum = travelnum;
}
public String getTravelname() {
	return Travelname;
}
public void setTravelname(String travelname) {
	Travelname = travelname;
}
public String getTravelversion() {
	return Travelversion;
}
public void setTravelversion(String travelversion) {
	Travelversion = travelversion;
}
}