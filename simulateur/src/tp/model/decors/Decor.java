/**
 * 
 */
package tp.model.decors;

import java.awt.Point;

/**
 * @author maxime.cornaton
 *
 */
public class Decor {

	private static int currentId = 0;
	/** identifiant unique de l'animal*/
	protected int id;

	/** position sur la carte*/
	protected Point coord;
	
	/**
	 * Renvoie un identifiant unique non encore utilisé
	 * @return un identifiant entier unique d'animal
	 */
	protected static int getUniqueId() {
		return currentId+=1;
	}
	
	/*
	 *  Accesseurs et mutateurs
	 */
	
	public int getId() {
		return id;
	}

	public Point getCoord() {
		return this.coord;
	}
	
	
	/*
	 * Redéfinitions de méthodes d'object
	 */
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()
				+" "+ this.getId()
				+", ("+(int) this.coord.getX()
				+"; "+(int) this.coord.getY()
				+"))"; 
	}
	
	/* 
	 * comportements d'instance
	 */
	
	
	
	public Decor() {
		super();
	}
	
	
}
