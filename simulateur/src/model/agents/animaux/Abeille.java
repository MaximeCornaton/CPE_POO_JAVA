/**
 * 
 */
package model.agents.animaux;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import model.agents.Animal;
import model.agents.Etat;
import model.comportements.Hebergeur;

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
	public void rencontrer(Animal a) {
		// TODO Auto-generated method stub
		if(a instanceof Varroa && this.peutAccueillir(a)){
			//Recuperation des etats possibles
			LinkedList<Etat> liste = new LinkedList<Etat>(Arrays.asList(Etat.values()));
			Iterator<Etat> it = liste.listIterator(liste.indexOf(etat));
			if(it.hasNext()) {etat = it.next();}
			
			
			
		}
	}

	@Override
	public boolean peutAccueillir(Animal animal) {
		// Decrit la capacité de l'abeille a heberger cet animal
		return animal instanceof Varroa;
	}

	@Override
	public boolean accueillir(Animal animal) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
