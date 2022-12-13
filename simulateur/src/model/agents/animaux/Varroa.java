/**
 * 
 */
package model.agents.animaux;

import model.agents.Animal;
import model.comportements.Hebergeur;

/**
 * @author maxime.cornaton
 *
 */
public class Varroa extends Animal {

	@Override
	public void setHebergement(Hebergeur hebergement) {
		// TODO Auto-generated method stub
		if(this.getHebergement() != null){
			super.setHebergement(hebergement);
		}
		
	}

	@Override
	public void seDeplacer() {
		// TODO Auto-generated method stub
		super.seDeplacer();
	}

}
