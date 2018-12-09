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
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackType;
//import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.BehaviourStrategy;

/** 
 *  Redhead duck for pond
 */
public class Redhead extends Duck {

  /** 
   *  Creates new redhead duck with appropriate bitmaps and GIFs.
   */
  public Redhead() {
		super("Redhead",
				  "redhead.bmp",
				  //FlyBehaviourFactory.createFlyBehavior("redhead flap"),
				  //SwimBehaviorFactory.createSwimBehavior("redhead paddle"),
				  //QuackBehaviourFactory.createQuackBehavior(QuackType.QUACK)
				  BehaviourStrategy.getBehaviors("redhead flap", "redhead paddle", QuackType.QUACK));
  }
}
