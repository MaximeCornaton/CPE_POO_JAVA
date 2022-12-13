/**
 * 
 */
package model.decors;

import model.agents.Animal;
import model.agents.animaux.Abeille;
import model.comportements.Hebergeur;

/**
 * @author maxime.cornaton
 *
 */
public class Ruche extends Decor implements Hebergeur{
	
	protected int miel;

	@Override
	public boolean peutAccueillir(Animal animal) {
		// TODO Auto-generated method stub
		return animal instanceof Abeille;
	}

	@Override
	public boolean accueillir(Animal animal) {
		// TODO Auto-generated method stub
		return false;
	}

}
