package tp.model.comportements;

import tp.model.agents.Animal;

/**
 * un hébergeur peut accueillir un animal
 * @author bruno
 *
 */
public interface Hebergeur {
	/**
	 * Renvoie vrai si a peut être acceuilli
	 * @param a 
	 * @return
	 */
	public boolean peutAccueillir(Animal animal);
	/**
	 * Renvoie vrai si l'animal a est acceuilli par l'hébergeur 
	 * @param animal
	 * @return
	 */
	public boolean accueillir(Animal animal);
}
