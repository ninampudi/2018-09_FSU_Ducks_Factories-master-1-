/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 12
 * Date: 2018-12-07
 * Author:NavyaInampudi
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.ducks;

//import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviourFactory;
//import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviourFactory;
//import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.BehaviourStrategy;

/**
 * Wooden decoys for the duck.
 */
public class WoodenDecoy extends Duck

{

	/**
	 * Creates a new wooden decoy with appropriate bitmaps and GIFs
	 */
	public WoodenDecoy() 
	{
		super("Wooden Decoy",
				  "wooden_decoy.bmp",
				 /** FlyBehaviourFactory.createFlyBehavior(null),
				  *SwimBehaviorFactory.createSwimBehavior("decoy floating"),
				  QuackBehaviourFactory.createQuackBehavior(null));	*/
				  BehaviourStrategy.getBehaviors(null, "decoy floating", null));
	}
}
