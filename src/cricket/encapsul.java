package cricket;

public class encapsul {
int jersey;
String name;
int run;
int wicket;
String specilazation;
public encapsul(int jersey, String name, int run, int wicket, String specilazation) {
	super();
	this.jersey = jersey;
	this.name = name;
	this.run = run;
	this.wicket = wicket;
	this.specilazation = specilazation;
}
public int getJersey() {
	return jersey;
}
public void setJersey(int jersey) {
	this.jersey = jersey;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRun() {
	return run;
}
public void setRun(int run) {
	this.run = run;
}
public int getWicket() {
	return wicket;
}
public void setWicket(int wicket) {
	this.wicket = wicket;
}
public String getSpecilazation() {
	return specilazation;

}
public void setSpecilazation(String specilazation) {
	this.specilazation = specilazation;
}
}
