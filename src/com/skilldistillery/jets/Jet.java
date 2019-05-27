package com.skilldistillery.jets;

public abstract class Jet {
	private String type;
	private String model;
	private double speed;
	private int range;
	private long price;

public Jet(String type, String model, double speed, int range, long price) {
	this.type = type;
	this.model = model;
	this.speed = speed;
	this.range = range;
	this.price = price;
	
}

public void getMach() {
	double machSpeed = this.speed / 767.269;
	System.out.print("Mach Speed: ");
	System.out.printf("%.2f %n%n", machSpeed);
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "Jet [type=" + type + ", model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
			+ "]";
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}
public int getRange() {
	return range;
}
public void setRange(int range) {
	this.range = range;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public void fly() {
	
}
public double getSpeedInMach() {
	return -1;
}
}