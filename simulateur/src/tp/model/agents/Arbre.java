/**
 * 
 */
package tp.model.agents;

import tp.model.comportements.Hebergeur;

/**
 * @author maxime.cornaton
 *
 */
public class Arbre extends Vegetal implements Hebergeur{

	@Override
	public boolean peutAccueillir(Animal animal) {
		// Decrit la capacité de l'arbre a heberger cet animal
		return animal.getClass().getSimpleName().equals("Frelons");
	}

	@Override
	public boolean accueillir(Animal animal) {
		// TODO Auto-generated method stub
		return false;
	}

}
