/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-12-07
 * Author:NavyaInampudi
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim;
 
 /**
  * 
  * Class instantiation 
  *
  */

public class SwimBehaviorFactory {

	/**
	 * 
	 * @param to display text while swimming
	 * @return instance of SwimBehavior
	 */
	public static SwimBehavior createSwimBehavior (String behavior) 
	{
		return new SimpleSwim(behavior);
	}
}