package person;

public class attribues {
private String name;
private double age;
private String country;
public attribues(String name, double age, String country) {
	super();
	this.name = name;
	this.age = age;
	this.country = country;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAge() {
	return age;
}
public void setAge(double age) {
	this.age = age;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
}
