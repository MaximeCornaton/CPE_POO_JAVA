/**
 * 
 */
package model.agents.vegetaux;

import model.agents.Animal;
import model.agents.animaux.Frelons;
import model.comportements.Hebergeur;

/**
 * @author maxime.cornaton
 *
 */
public class Arbre extends Vegetal implements Hebergeur{
	
	private int taille;

	@Override
	public boolean peutAccueillir(Animal animal) {
		// TODO Auto-generated method stub
		return animal instanceof Frelons;
	}

	@Override
	public boolean accueillir(Animal animal) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void produitNourriture(int unite) {
		// TODO Auto-generated method stub
		super.produitNourriture(unite);
	}
	
	@Override
	public void produitNourriture() {
		// TODO Auto-generated method stub
		this.produitNourriture(2^(taille));
	}
	
	
}
