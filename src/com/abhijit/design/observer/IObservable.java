package com.abhijit.design.observer;

public interface IObservable {
	public void registerObserver(IObserver obj);
	public void removeObserver(IObserver obj);
	public void notifyObserver();
}
