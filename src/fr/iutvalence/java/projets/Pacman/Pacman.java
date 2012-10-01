package fr.iutvalence.java.projets.Pacman;


/**
 * on modélise ici le personnage principale de type pacman, il peut se déplacer soit de façon manuelle soit de façon automatique.
 * Le personnage peut se déplacer à gauche ,
 *  à droite, en haut et en bas. Il peut être détruit par des fantômes(voir classe Fantome)
 * @author elmanssy
 *
 */
public class Pacman {
	// FIXME écrire un commentaire
	private int vitesse;
	
	// FIXME écrire un commentaire
	protected int vie; 
	
	// FIXME créer un type Position ou Coordonnees
	// FIXME écrire un commentaire
	private int placementxPM;
	
	// FIXME écrire un commentaire
	private int placementyPM;
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	private boolean Etat;
	
	// FIXME écrire un commentaire
	/**
	 * 
	 */
	public void mort(){
		this.Etat = false;
		this.placementxPM = 10;
		this.placementyPM = 2;
		this.vie = this.vie -1;
	}
	
	// FIXME écrire un commentaire
	public void vivant(){
		this.Etat = true;
	}
	
	// FIXME remplacer par un "vrai" constructeur
	public void pacman(){
		this.placementxPM = 10;
		this.placementyPM = 2;
		this.vitesse = 10;
		this.vie = 3;
		this.Etat = true;
	}
	

}

