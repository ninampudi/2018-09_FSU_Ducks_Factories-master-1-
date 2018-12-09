/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviourFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviourFactory;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackType;

/**
 * Mallard duck for pond
 */
public class Mallard extends Duck {

	/**
	 * Creates a new Mallard duck with appropriate bitmaps and GIFs
	 */
	public Mallard() {
		super("Mallard",
			  "mallard.bmp",
			  FlyBehaviourFactory.createFlyBehavior("mallard flap"),
			  SwimBehaviorFactory.createSwimBehavior("mallard paddle"),
			  QuackBehaviourFactory.createQuackBehavior(QuackType.QUACK));
		
	}
}
