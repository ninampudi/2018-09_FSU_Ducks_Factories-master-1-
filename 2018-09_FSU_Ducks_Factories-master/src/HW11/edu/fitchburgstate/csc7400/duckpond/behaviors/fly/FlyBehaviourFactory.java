/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-12-07
 * Author:NavyaInampudi
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly;

/** 
 *  Class instantiation
 */
public class FlyBehaviourFactory {
	
	/**
	 * 
	 * @param displays text while flying
	 * @return instance of FlyingBehavior
	 */
	@SuppressWarnings("unused")
	public static FlyingBehavior createFlyBehavior(String type)
	{
		FlyingBehavior flyingbehavior;
		
		if( type!=null )
			flyingbehavior = new SimpleFly(type);	
		else
			flyingbehavior = new CannotFly();
		
		return flyingbehavior;
	}
}
