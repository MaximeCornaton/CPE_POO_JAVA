/**
 * 
 */
package model.agents.animaux;

import model.agents.Animal;
import model.agents.Etat;

/**
 * @author maxime.cornaton
 *
 */
public class Frelons extends Animal {
	
	private boolean faim = false;
	
	@Override
	public void rencontrer(Animal a) {
		// TODO Auto-generated method stub
		if(a instanceof Abeille){
			a.setEtat(Etat.EnDetresse);
		}
	}
	
	private void gestionProie(Animal a) {
		if(faim && a instanceof Abeille) {
			faim = false;
			a.setEtat(Etat.Mourant);
		}
	}

}
