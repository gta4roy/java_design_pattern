package com.abhijit.design.strategy;

public class DuckProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck obj = new DuckA();
		obj.setFlyBehaviour(new FlyWithWings());
		obj.setQuackBehavior(new MuteQuack());
		obj.display();
		obj.swim();
		obj.performFly();
		obj.performQuack();
		
		Duck obj2 = new DuckB();
		obj2.setFlyBehaviour(new NoFlying());
		obj2.setQuackBehavior(new SqueakQuake());
		obj2.display();
		obj2.swim();
		obj2.performFly();
		obj2.performQuack();
	}

}
