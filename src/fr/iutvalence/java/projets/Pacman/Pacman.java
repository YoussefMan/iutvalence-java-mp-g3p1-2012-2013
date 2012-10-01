package fr.iutvalence.java.projets.Pacman;

/**
 * Le personnage que le joueur contrôle. Il peut se déplacer à gauche ,
 *  à droite, en haut et en bas. Il peut être détruit par des fantômes(voir classe Fantome)
 * @author elmanssy
 *
 */
public class Pacman {
	private int vitesse;
	private int vie; 
	private int placementxPM;
	private int placementyPM;
	private boolean Etat;
	
	public void mort(){
		this.Etat = false;
		this.placementxPM = 10;
		this.placementyPM = 2;
		this.vie = this.vie -1;
	}
	
	public void vivant(){
		this.Etat = true;
	}
	
	public void pacman(){
		this.placementxPM = 10;
		this.placementyPM = 2;
		this.vitesse = 10;
		this.vie = 3;
		this.Etat = true;
	}
	

}

iutvalence-java-mp-g3p1-2012-2013