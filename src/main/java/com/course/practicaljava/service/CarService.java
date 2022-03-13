package com.course.practicaljava.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.course.practicaljava.entity.Car;

@Service
public interface CarService {

	List<String> BRANDS = List.of("Toyota", "Honda", "Ford");

	List<String> COLORS = List.of("Red", "Black", "White");

	List<String> TYPES = List.of("Sedan", "SUV", "MPV");

	List<String> ADDITIONS = List.of("GPS", "Alarm", "Sunroof", "Media player", "Leather seats");

	Car generateCar();

}
