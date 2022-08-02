package com.abhijit.design.observer;

public class Main {
	public static void main(String args[]) {
		WeatherData db = new WeatherData();
		TemperatureDisplay temp = new TemperatureDisplay(db);
		PressureDisplay pv = new PressureDisplay(db);
		HumidityDisplay hm = new HumidityDisplay(db);
		
		db.setMeasurements(34, 78, 23);
		db.setMeasurements(98, 23, 13);
		db.setMeasurements(89, 24, 67);
		db.setMeasurements(12, 44, 73);
		
	}
}
