package launchers;

import java.awt.Point;

import tp.model.agents.Agent;
import tp.model.agents.Animal;
import tp.model.agents.Sexe;


public class LauncherTP2 {
	
	public static void main(String [] args) {
		Agent a = new Animal(Sexe.Femelle,new Point(25,30));
		
		//tester la hiérarchie d'agent
		System.out.println(a);
		
		
		//Tester les hebergeurs
		
		
	}

}
