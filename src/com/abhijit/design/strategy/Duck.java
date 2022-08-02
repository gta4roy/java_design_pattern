package com.abhijit.design.strategy;

public abstract class Duck {
	private FlyBehaviour flyBehaviour = null;
	private QuacBehaviour quakBehaviour = null;
	
	public Duck() {
		
	}
	
	public void setFlyBehaviour(FlyBehaviour behave) {
		this.flyBehaviour = behave;
	}
	
	public void setQuackBehavior(QuacBehaviour quackBehave) {
		this.quakBehaviour = quackBehave;
	}
	public abstract void display();
	public void performFly() {
		this.flyBehaviour.fly();
	}
	public void performQuack() {
		this.quakBehaviour.Quack();
	}
	public void swim() {
		System.out.println("ALl Ducks Swim");
	}
}
