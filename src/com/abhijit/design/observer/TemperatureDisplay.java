package com.abhijit.design.observer;

public class TemperatureDisplay implements IObserver , IDisplay {
	
	private WeatherData data;
	public TemperatureDisplay(WeatherData db) {
		this.data = db;
		this.data.registerObserver(this);
	}
	

	float temperatureValue;
	@Override
	public void update() {
		temperatureValue = this.data.getTemperature();
		Display();
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Temperature Display :"+this.temperatureValue);
	}

}
