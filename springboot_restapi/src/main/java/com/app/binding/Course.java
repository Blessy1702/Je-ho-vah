package com.app.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;

//@Data // To generate getters and setters for the properties.
@Entity // to represent class as a entity class  or  to represent the below properties as a persistent componenet as the 
@Table(name="COURSE_DETAILS")// Used to map our name class name Course with the database table name
// @table is not mandatary if we dont give that class name is given as the table name

public class Course 
{
	@Id // respresents that the column Id  is a primary key mapped column
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this will automatically generate values inside the tables.
  private int cid; // create  3 properties
  private String name;
  private float price;
@Override
public String toString() {
	return "Course [cid=" + cid + ", name=" + name + ", price=" + price + "]";
	
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
  


}
