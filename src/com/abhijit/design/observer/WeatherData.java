package com.abhijit.design.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IObservable{
	
	private List<IObserver> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
		
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	
	@Override
	public void registerObserver(IObserver obj) {
		// TODO Auto-generated method stub
		this.observers.add(obj);
	}

	@Override
	public void removeObserver(IObserver obj) {
		// TODO Auto-generated method stub
		this.observers.remove(obj);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(IObserver observer: this.observers) {
			observer.update();
		}	
	}
	public void measurementChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		measurementChanged();
	}
	
	public float getTemperature() {
		return this.temperature;
	}
	
	public float getHumidity() {
		return this.humidity;
		
	}
	public float getPressure() {
		return this.pressure;
	}
}
