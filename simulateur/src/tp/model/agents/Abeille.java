/**
 * 
 */
package tp.model.agents;

import tp.model.comportements.Hebergeur;

/**
 * @author maxime.cornaton
 *
 */
public class Abeille extends Animal implements Hebergeur{
	/**
		 * @author maxime.cornaton
		 *
		 */

	protected int miel;

	@Override
	public boolean peutAccueillir(Animal animal) {
		// Decrit la capacité de l'abeille a heberger cet animal
		return animal.getClass().getSimpleName().equals("Varroa");
	}

	@Override
	public boolean accueillir(Animal animal) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
