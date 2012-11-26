package fr.iutvalence.java.projets.Pacman.test;

import fr.iutvalence.java.projets.Pacman.Partie;
import fr.iutvalence.java.projets.Pacman.ZoneDeJeux;

import java.lang.Thread;
/**
 * Cette classe de test permet de tester le comportement d'une partie. Ici on cree une partie et on la démarre.
 * 
 * @author elmanssy
 * 
 * 
 * 
 */

public class TestPartie
{

	public static void main(String[] args)
	{
		int i = 0;
		i = 1;
		Partie p = new Partie();
		while(i == 1){
		p.demarrer();
		System.out.println(p.ZoneTest.toString());
		/*try
		{
			Thread.sleep(100);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}*/
	}
	}
}
