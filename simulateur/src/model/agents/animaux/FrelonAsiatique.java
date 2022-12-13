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
public class FrelonAsiatique extends Frelons {
	
	@Override
	public void rencontrer(Animal a) {
		// TODO Auto-generated method stub
		if(a instanceof FrelonEuropeen){
			a.setEtat(Etat.EnDetresse);
		}
	}
}
