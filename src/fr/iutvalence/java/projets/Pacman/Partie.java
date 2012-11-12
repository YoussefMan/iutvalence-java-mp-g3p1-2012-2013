package fr.iutvalence.java.projets.Pacman;

import fr.iutvalence.java.projets.Pacman.Direction.Dir;

// FIXME(fixed) compléter le commentaire
/**
 * la classe Partie gérera tout le déroulement de la partie 
 * @author elmanssy
 * 
 */
// FIXME ne pas mettre de main dans cette classe, mais une méthode "demarrer" qui execute une partie
// FIXME pour l'instant, implémenter un comportement simple où pacman se déplace seul avec une décision de déplacement
// aléatoire (à discuter)

public class Partie
{

	private int nombredebillesinit;
	private int nombredebilles;
	private int nombredegommesinit;
	private int nombredegommes;
	private int score;

	public Partie()
	{

		ZoneDeJeux ZoneTest = new ZoneDeJeux();
		this.nombredebilles = ZoneTest.getBilles();
		this.score = 0;
		Pacman Perso = new Pacman();
		Fantome F1 = new Fantome(4,1);
		Fantome F2 = new Fantome(16,1);
		
	}

	public void demarrer()
	{  
		
		int Position;
		Pacman Perso = new Pacman();
		ZoneDeJeux ZoneTest = new ZoneDeJeux();
		ZoneTest.toString();
		Dir test;
		test = Direction.dirAlea();
		
		// HAUT
		
		if ( test == test.haut) {
			Position =  Perso.getPosition().getY() + 1;
		
				
			if(ZoneTest.getValeur(Perso.getPosition().getX(),Position) != 0){
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				Perso.getPosition().setY(Perso.getPosition().getY()+1);
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),ZoneTest.VALEUR_PACMAN);
			}
		}
		
	// Bas
		
		if ( test == test.bas) {
			Position =  Perso.getPosition().getY() - 1;
		
				
			if(ZoneTest.getValeur(Perso.getPosition().getX(),Position) != 0){
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				Perso.getPosition().setY(Perso.getPosition().getY()- 1);
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),ZoneTest.VALEUR_PACMAN);
			}
		}
		
	// Gauche
		
		if ( test == test.gauche) {
			Position =  Perso.getPosition().getX() - 1;
		
				
			if(ZoneTest.getValeur(Perso.getPosition().getX(),Position) != 0){
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				Perso.getPosition().setX(Perso.getPosition().getX()-1);
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),ZoneTest.VALEUR_PACMAN);
			}
		}
		
	// Droite
		
		if ( test == test.droite) {
			Position =  Perso.getPosition().getX() + 1;
		
				
			if(ZoneTest.getValeur(Perso.getPosition().getX(),Position) != 0){
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				Perso.getPosition().setX(Perso.getPosition().getX()+1);
				ZoneTest.setValeur(Perso.getPosition().getX(), Perso.getPosition().getY(),ZoneTest.VALEUR_PACMAN);
			}
		}
		
		ZoneTest.toString();
		
	}
	
	
	
	
}
