package com.course.practicaljava.entity;

import java.time.LocalDate;
import java.util.List;

public class Car {

	private List<String> additions;

	private boolean available;

	private String brand;

	private String color;

	private LocalDate firstReleaseDate;

	private int price;

	private String type;

	public Car() {

	}

	public Car(String brand, String color, String type) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
	}

	public List<String> getAdditions() {
		return additions;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public LocalDate getFirstReleaseDate() {
		return firstReleaseDate;
	}

	public int getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAdditions(List<String> additions) {
		this.additions = additions;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFirstReleaseDate(LocalDate firstReleaseDate) {
		this.firstReleaseDate = firstReleaseDate;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + ", available="
				+ available + ", firstReleaseDate=" + firstReleaseDate + "]";
	}

}
