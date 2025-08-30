package com.tka.july16;

public class encapsul {
	
 private int roll;
 private String name;
 private int mark;
 
 
 encapsul(){}
	 encapsul(int r,String n,int m){
	roll=r;
	name=n;
	mark=m;
	 }
		 
	 
	
	public int getroll() {
		 return roll;
		 
	 }
	 public void setroll(int r) {
		 roll=r;
 }
	 public String getname() {
		 return name;
		 
	 }
	 public void setname(String n) {
		 name=n;
 }
	 public int getmark() {
		 return mark;
		 
	 }
	 public void setmark(int m) {
		 mark=m;
 }
	 
}

