package com.abhijit.design.observer;

public class HumidityDisplay implements IObserver , IDisplay {
	
	private WeatherData data;
	public HumidityDisplay(WeatherData db) {
		this.data = db;
		this.data.registerObserver(this);
	}
	

	float humidityValue;
	@Override
	public void update() {
		humidityValue = this.data.getHumidity();
		Display();
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("Humidity Display :"+this.humidityValue);
	}

}
