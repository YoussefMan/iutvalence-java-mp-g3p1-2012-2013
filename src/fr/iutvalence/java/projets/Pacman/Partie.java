package fr.iutvalence.java.projets.Pacman;

import fr.iutvalence.java.projets.Pacman.Direction.Dir;

/**
 * la classe Partie gérera tout le déroulement de la partie
 * 
 * @author elmanssy
 * 
 */
public class Partie
{
	// FIXME commentaire
	// FIXME respecter les conventions d'écriture
	private int nombredebillesinit;

	// FIXME commentaire
	// FIXME respecter les conventions d'écriture
	private int nombredebilles;

	// FIXME commentaire
	// FIXME respecter les conventions d'écriture
	private int nombredegommesinit;

	
	// FIXME commentaire
	// FIXME respecter les conventions d'écriture
	private int nombredegommes;
	
	
	// FIXME commentaire
	// FIXME respecter les conventions d'écriture
	private int score;

	// FIXME commentaire
	public Partie()
	{

		ZoneDeJeux ZoneTest = new ZoneDeJeux();
		this.nombredebilles = ZoneTest.getBilles();
		this.score = 0;
		
		// FIXME attention : ici ce sont des valriables LOCALES, perdues à la sortie du constructeur 
		Pacman Perso = new Pacman();
		Fantome F1 = new Fantome(4, 1);
		Fantome F2 = new Fantome(16, 1);

	}

	// FIXME commentaire
	public void demarrer()
	{

		int Position;
		// FIXME pourquoi recréer la zone de jeux et le pacman ?
		Pacman Perso = new Pacman();
		ZoneDeJeux ZoneTest = new ZoneDeJeux();

		ZoneTest.toString();
		Dir test;
		test = Direction.dirAlea();

		// HAUT

		// FIXME essayer de factoriser un peu le code...
		if (test == test.haut)
		{
			Position = Perso.getPosition().getY() + 1;

			if (ZoneTest.getValeur(Perso.getPosition().getX(), Position) != 0)
			{
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),
						ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				Perso.getPosition().setY(Perso.getPosition().getY() + 1);
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(), ZoneTest.VALEUR_PACMAN);
			}
		}

		// Bas

		if (test == test.bas)
		{
			Position = Perso.getPosition().getY() - 1;

			if (ZoneTest.getValeur(Perso.getPosition().getX(), Position) != 0)
			{
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),
						ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				Perso.getPosition().setY(Perso.getPosition().getY() - 1);
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(), ZoneTest.VALEUR_PACMAN);
			}
		}

		// Gauche

		if (test == test.gauche)
		{
			Position = Perso.getPosition().getX() - 1;

			if (ZoneTest.getValeur(Perso.getPosition().getX(), Position) != 0)
			{
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),
						ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				Perso.getPosition().setX(Perso.getPosition().getX() - 1);
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(), ZoneTest.VALEUR_PACMAN);
			}
		}

		// Droite

		if (test == test.droite)
		{
			Position = Perso.getPosition().getX() + 1;

			if (ZoneTest.getValeur(Perso.getPosition().getX(), Position) != 0)
			{
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),
						ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				Perso.getPosition().setX(Perso.getPosition().getX() + 1);
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(), ZoneTest.VALEUR_PACMAN);
			}
		}

		ZoneTest.toString();

	}

}
