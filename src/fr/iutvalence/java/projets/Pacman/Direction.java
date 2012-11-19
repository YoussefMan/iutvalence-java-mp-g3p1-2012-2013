package fr.iutvalence.java.projets.Pacman;

import java.util.Random;

public class Direction
{

	public enum Dir
	{
		haut,bas,gauche,droite;
	}
	
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
	
	
	
	
	
	
	
	
	
