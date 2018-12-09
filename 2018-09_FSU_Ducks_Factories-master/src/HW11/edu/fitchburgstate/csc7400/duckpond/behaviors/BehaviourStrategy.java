/**
* Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 12
 * Date: 2018-12-07
 * Author:NavyaInampudi
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviourFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyingBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviourFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackType;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;

public class BehaviourStrategy {
	
	public String flyBehavior;
	public QuackType quackBehavior;
	public String swimBehavior;
	
	/**  
	  * Return fly behavior
	 */
	
	 public FlyingBehavior getFlyBehavior() 
	 {
		 return FlyBehaviourFactory.createFlyBehavior(this.flyBehavior);
	 }

	 /**
	  * Return quack behavior
	  */
	 public QuackBehavior getQuackBehavior() {
		 return QuackBehaviourFactory.createQuackBehavior(this.quackBehavior);
	 }

	 /**
	  * Return swim behavior
	  */
	 public SwimBehavior getSwimBehavior() {
		 return SwimBehaviorFactory.createSwimBehavior(this.swimBehavior);
	 }

	 /**
	  * specific values for a duck behavior initialize
	  * @param flyBehavior text to describe flying behavior 
	  * @param swimBehavior text to describe swimming behavior 
	  * @param quackBehavior QuackType to describe duck sound 
	  * @return behaviourstrategy an instance of BehaviorStrategy
	  */
	public static BehaviourStrategy getBehaviors(String flyBehavior, String swimBehavior, QuackType quackBehavior) 
	{
		BehaviourStrategy behaviourstrategy = new BehaviourStrategy();
		behaviourstrategy.flyBehavior = flyBehavior;
		behaviourstrategy.quackBehavior = quackBehavior;
		behaviourstrategy.swimBehavior = swimBehavior;
		return behaviourstrategy;
	}
}