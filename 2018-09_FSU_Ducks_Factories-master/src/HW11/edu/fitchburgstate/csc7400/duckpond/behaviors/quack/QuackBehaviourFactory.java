/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-12-07
 * Author:NavyaInampudi
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;


/** 
 *  Class instantiation
 */

public class QuackBehaviourFactory {

	/**
	 * 
	 * @param type (with type of sound of duck) 
	 * @return QuackBehavior instance
	 */
	
	public static QuackBehavior createQuackBehavior(QuackType type)
	{
		QuackBehavior quackbehavior;
		
		if(type!=null && type.equals(QuackType.SQUEAK))
			quackbehavior = new Squeak();		
		else if(type!=null && type.equals(QuackType.QUACK))
			quackbehavior = new DuckQuack();
		else 
			quackbehavior = new CannotQuack();

		return quackbehavior;
	}
}
