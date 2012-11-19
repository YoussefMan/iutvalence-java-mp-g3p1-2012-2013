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
	public ZoneDeJeux ZoneTest;
	private Pacman Perso;
	private Fantome F1;
	private Fantome F2;

	

	/**
	 * Initialisation d'une partie , On positionne les pacmans, 
	 * et les fantomes sur la mini map, On inisialise le score ainsi que le bnombre de bille
	 */
	public Partie()
	{

		this.ZoneTest = new ZoneDeJeux();
		this.nombredebilles = this.ZoneTest.getBilles();
		this.score = 0;
		this.Perso = new Pacman();
		this.F1 = new Fantome(4,1);
		this.F2 = new Fantome(16,1);
		
	}

	/**
	 * Une Methode demarrer qui execute une partie
	 */
	public void demarrer()
	{  
		Dir test = Direction.dirAlea();
		Position trans;
		trans = this.Perso.getPosition().translation(test);
		if(this.ZoneTest.getValeur(trans.getX(),trans.getY()) != 0){
			this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_SCORE_BILLE_MANGE);
			this.Perso.getPosition().setX(trans.getX());
			this.Perso.getPosition().setY(trans.getY());
			this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_PACMAN);
		}
		
		/*
		
		int Position;
		this.ZoneTest.toString();
		Dir test;
		test = Direction.dirAlea();
		
		// HAUT
		
		if ( test == test.haut) {
			Position =  this.Perso.getPosition().getY() + 1;
		
				
			if(this.ZoneTest.getValeur(this.Perso.getPosition().getX(),Position) != 0){
				this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				this.Perso.getPosition().setY(this.Perso.getPosition().getY()+1);
				this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_PACMAN);
			}
		}
		
	// Bas
		
		if ( test == test.bas) {
			Position =  this.Perso.getPosition().getY() - 1;
		
				
			if(this.ZoneTest.getValeur(this.Perso.getPosition().getX(),Position) != 0){
				this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				this.Perso.getPosition().setY(this.Perso.getPosition().getY()- 1);
				this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_PACMAN);
			}
		}
		
	// Gauche
		
		if ( test == test.gauche) {
			Position =  this.Perso.getPosition().getY();
		
				
			if(this.ZoneTest.getValeur(this.Perso.getPosition().getX()-1,Position) != 0){
				this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				this.Perso.getPosition().setX(this.Perso.getPosition().getX()-1);
				this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_PACMAN);
			}
		}
		
	// Droite
		
		if ( test == test.droite) {
			Position =  this.Perso.getPosition().getY();
		
				
			if(this.ZoneTest.getValeur(this.Perso.getPosition().getX()+1,Position) != 0){
				this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_SCORE_BILLE_MANGE);
				this.Perso.getPosition().setX(this.Perso.getPosition().getX()+1);
				this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_PACMAN);
			}
		}
		
	
		
	}
	
	/*
	  public int getScore( ZoneDeJeux ZoneTest ) {
		  int res = 0 ;
		  res = (NOMBRE_DE_BILLES_INIT - nombredebilles)* ZoneTest.VALEUR_SCORE_BILLE+( NOMBRE_DE_GOMMES_INIT - nombredegommes )* ZoneTest.VALEUR_SCORE_GOMME;
		 return res;
	  }
	
	*/
	
}
}