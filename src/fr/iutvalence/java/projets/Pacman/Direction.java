package fr.iutvalence.java.projets.Pacman;

import java.util.Random;

// FIXME(FIXED) commentaire
/**
 * La classe direction permet de définir aleatoirement une direction(haut, bas,gauche,droite).
 * @author elmanssy
 *
 */
public class Direction
{
	//FIXME(FIXED)  simplifier en définissant Direction comme une énumération et non une classe (à discuter)
	public enum Dir
	{
		haut,bas,gauche,droite;
	}
	
	// FIXME(FIXED) commentaire
	/**les driections aléatoires sont définis à l'aide d'un random jusqu'à 4.
	 * @return
	 */
	public static Dir dirAlea()
	{

		Random rnd = new Random();
		int r = rnd.nextInt(4);
		switch(r)
		{
		case 0 : return Dir.haut;
		case 1 : return Dir.bas;
		case 2 : return Dir.gauche;
		default: 
			 return Dir.droite;
		}
	}
}
	
	
	
	
	
	
	
	
	
