package com.abhijit.design.observer;

public class PressureDisplay implements IObserver , IDisplay {
	
	private WeatherData data;
	public PressureDisplay(WeatherData db) {
		this.data = db;
		this.data.registerObserver(this);
	}
	

	float pressureValue;
	@Override
	public void update() {
		pressureValue = this.data.getPressure();
		Display();
	}

	@Override
	public void Display() {
		// TODO Auto-generated method stub
		System.out.println("PressureValue Display :"+this.pressureValue);
	}

}
