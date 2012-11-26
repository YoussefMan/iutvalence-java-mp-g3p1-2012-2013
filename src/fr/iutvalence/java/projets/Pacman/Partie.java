package fr.iutvalence.java.projets.Pacman;

import fr.iutvalence.java.projets.Pacman.Direction.Dir;

// FIXME(fixed) compléter le commentaire
/**
 * la classe Partie gérera tout le déroulement de la partie 
 * @author elmanssy
 * 
 */
// FIXME (FIXED) ne pas mettre de main dans cette classe, mais une méthode "demarrer" qui execute une partie
// FIXME (FIXED) pour l'instant, implémenter un comportement simple où pacman se déplace seul avec une décision de déplacement
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
		Dir testPacMan = Direction.dirAlea();
		Dir testF1 = Direction.dirAlea();
		Dir testF2 = Direction.dirAlea();
		Position transPacman;
		Position transF1;
		Position transF2;
		
		//Deplacement du PacMan
		transPacman = this.Perso.getPosition().translation(testPacMan);
		if(this.ZoneTest.getValeur(transPacman.getX(),transPacman.getY()) != 0){
			
			this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_SCORE_BILLE_MANGE);
			this.Perso.getPosition().setX(transPacman.getX());
			this.Perso.getPosition().setY(transPacman.getY());
			this.ZoneTest.setValeur(this.Perso.getPosition().getX(), this.Perso.getPosition().getY(),this.ZoneTest.VALEUR_PACMAN);
		}
		//Deplacement du premier fantome
		transF1  = this.F1.getPosition().translation(testF1);
		if(this.ZoneTest.getValeur(transF1.getX(),transF1.getY()) != 0){
		  if((this.ZoneTest.getValeur(this.F1.getPosition().getX() - transF1.getX(),this.F1.getPosition().getY() - transF1.getY()) == this.ZoneTest.VALEUR_FANTOME_1)){
			  this.ZoneTest.setValeur(this.F1.getPosition().getX() - transF1.getX(), this.F1.getPosition().getY() - transF1.getY() ,this.ZoneTest.VALEUR_SCORE_BILLE);
		  }
		  if((this.ZoneTest.getValeur(F1.getPosition().getX()- transF1.getX(),F1.getPosition().getY()- transF1.getY()) == this.ZoneTest.VALEUR_SCORE_BILLE)){
			  this.ZoneTest.setValeur(this.F1.getPosition().getX()- transF1.getX(), this.F1.getPosition().getY()  - transF1.getY() ,this.ZoneTest.VALEUR_SCORE_BILLE);
		  }
		  if((this.ZoneTest.getValeur(this.F1.getPosition().getX()- transF1.getX(),F1.getPosition().getY()- transF1.getY()) == this.ZoneTest.VALEUR_SCORE_BILLE_MANGE)){
			  this.ZoneTest.setValeur(F1.getPosition().getX()- transF1.getX(),F1.getPosition().getY()- transF1.getY(),this.ZoneTest.VALEUR_SCORE_BILLE_MANGE);
		  }
		  if((this.ZoneTest.getValeur(F1.getPosition().getX()- transF1.getX(),F1.getPosition().getY()- transF1.getY()) == this.ZoneTest.VALEUR_SCORE_GOMME)){
			  this.ZoneTest.setValeur(F1.getPosition().getX()- transF1.getX(),F1.getPosition().getY()- transF1.getY(),this.ZoneTest.VALEUR_SCORE_GOMME);
		  }
			this.F1.getPosition().setX(transF1.getX());
			this.F1.getPosition().setY(transF1.getY());
			this.ZoneTest.setValeur(this.F1.getPosition().getX(), this.F1.getPosition().getY(),this.ZoneTest.VALEUR_FANTOME_1);
			
		} 
		
		//Deplacement du deuxieme fantome
		transF2  = this.F2.getPosition().translation(testF2);
		if(this.ZoneTest.getValeur(transF2.getX(),transF2.getY()) != 0){
			 if((this.ZoneTest.getValeur(F2.getPosition().getX()- transF2.getX(),F2.getPosition().getY()- transF2.getY()) == this.ZoneTest.VALEUR_FANTOME_2)){
				  this.ZoneTest.setValeur(F2.getPosition().getX()- transF2.getX(),F2.getPosition().getY()- transF2.getY(),this.ZoneTest.VALEUR_SCORE_BILLE);
			  }
			  if(this.ZoneTest.getValeur(F2.getPosition().getX()- transF2.getX(),F2.getPosition().getY()- transF2.getY()) == this.ZoneTest.VALEUR_SCORE_BILLE){
				  this.ZoneTest.setValeur( F2.getPosition().getX()- transF2.getX(),F2.getPosition().getY()- transF2.getY(),this.ZoneTest.VALEUR_SCORE_BILLE);
			  }
			  if((this.ZoneTest.getValeur(F2.getPosition().getX()- transF2.getX(),F2.getPosition().getY()- transF2.getY()) == this.ZoneTest.VALEUR_SCORE_BILLE_MANGE)){
				  this.ZoneTest.setValeur(this.F2.getPosition().getX(), this.F2.getPosition().getY(),this.ZoneTest.VALEUR_SCORE_BILLE_MANGE);
			  }
			  if((this.ZoneTest.getValeur(F2.getPosition().getX()- transF2.getX(),F2.getPosition().getY()- transF2.getY()) == this.ZoneTest.VALEUR_SCORE_GOMME)){
				  this.ZoneTest.setValeur(this.F2.getPosition().getX(), this.F2.getPosition().getY(),this.ZoneTest.VALEUR_SCORE_GOMME);
			  }
			
			this.F2.getPosition().setX(transF2.getX());
			this.F2.getPosition().setY(transF2.getY());
			this.ZoneTest.setValeur(this.F2.getPosition().getX(), this.F2.getPosition().getY(),this.ZoneTest.VALEUR_FANTOME_2);
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