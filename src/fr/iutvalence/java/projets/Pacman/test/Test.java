
package fr.iutvalence.java.projets.Pacman.test;

import fr.iutvalence.java.projets.Pacman.ZoneDeJeux;

// FIXME(FIXED) compléter le commentaire
/**
 * Cette classe de test permet de tester nos classes, ici on affiche pour commencer la zone de jeu.
 * Dans un main on affiche chacune de nos classes.
 * @author elmanssy
 * 
 *
 *
 */

public class Test {

	/**
	 * ce main permet de tester les differentes instances de classe
	 * @param args (aucun)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		ZoneDeJeux ZoneTest = new  ZoneDeJeux();
		System.out.println(ZoneTest.toString());
	}

}
