package launchers;

import java.awt.Point;

import model.agents.Agent;
import model.agents.Animal;
import model.agents.Sexe;
import model.agents.animaux.Abeille;
import model.agents.animaux.Frelons;
import model.agents.vegetaux.Arbre;



public class LauncherTP2 {
	
	public static void main(String [] args) {
		Agent a = new Animal(Sexe.Femelle,new Point(25,30));
		
		//tester la hiérarchie d'agent
		System.out.println(a);
		
		
		//Tester les hebergeurs
		Abeille abeille1 = new Abeille();
		Frelons frelon1 = new Frelons();
		
		
		Arbre arbre1 = new Arbre();
		System.out.println(arbre1.peutAccueillir(abeille1));
		System.out.println(arbre1.peutAccueillir(frelon1));
		
		
	}

}
