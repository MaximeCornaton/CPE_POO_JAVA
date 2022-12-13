/**
 * 
 */
package model.agents.vegetaux;

import model.agents.Agent;

/**
 * @author maxime.cornaton
 *
 */
public class Vegetal extends Agent {
	
	private int nourriture = 0;
	
	public Vegetal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void produitNourriture(int unite) {
		this.setNourriture(this.getNourriture()+unite);
	}
	
	public void produitNourriture() {
		this.produitNourriture(1);
	}
	
	public void setNourriture(int nourriture) {
		this.nourriture = nourriture;
	}
	
	public int getNourriture() {
		return this.nourriture;
	}

	
}
