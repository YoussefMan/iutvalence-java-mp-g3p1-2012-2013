package fr.iutvalence.java.projets.Pacman;

import java.util.Random;

// FIXME commentaire
public class Direction
{
	// FIXME simplifier en définissant Direction comme une énumération et non une classe (à discuter)
	public enum Dir
	{
		haut,bas,gauche,droite;
	}
	
	// FIXME commentaire
	public static Dir dirAlea()
	{

		Random rnd = new Random();
		int r = rnd.nextInt(3);
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
	
	
	
	
	
	
	
	
	
