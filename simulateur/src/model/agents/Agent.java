package model.agents;

import java.awt.Point;

public class Agent {

	private static int currentId = 0;
	/** identifiant unique de l'animal*/
	protected int id;
	/** age en unité de temps*/
	protected int age;
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

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		int oldAge = this.age;
		//On change l'age si le nouveau est superieur
		this.age = (age > oldAge) ? age : oldAge; 
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
	
	public void vieillir() {
		//TODO fait vieillir l'animal d'une unité de temps
		//une bonne manière de faire, une moins bonne...
		
		//this.setAge(this.age+=1);
		this.setAge(this.age+1);
	}
	
	public void seNourrir() {
		//TODO
	}
	
	public Agent() {
		super();
	}


}