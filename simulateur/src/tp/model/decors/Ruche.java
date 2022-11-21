/**
 * 
 */
package tp.model.decors;

import tp.model.agents.Animal;
import tp.model.comportements.Hebergeur;

/**
 * @author maxime.cornaton
 *
 */
public class Ruche extends Decor implements Hebergeur{
	
	protected int miel;
	
	@Override
	public boolean peutAccueillir(Animal animal) {
		// Decrit la capacité de la ruche a heberger cet animal
		return animal.getClass().getSimpleName().equals("Abeille");
	}

	@Override
	public boolean accueillir(Animal animal) {
		// TODO Auto-generated method stub
		return false;
	}

}
