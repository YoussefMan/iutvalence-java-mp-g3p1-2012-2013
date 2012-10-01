package fr.iutvalence.java.projets.Pacman;

/**
 * 
 * @author elmanssy
 *
 */
public class Fantome {
	
	
	/**
	 * 
	 */
	private boolean etat; 
	
	// FIXME écrire un commentaire*
	// FIXME définir une vraie constante
	private static final int NBFANTOME = 4;
	
	// FIXME écrire un commentaire
	private int vitesse;
	
	// FIXME écrire un commentaire
	private int x;
	
	// FIXME écrire un commentaire
	private int y;
	
	// FIXME écrire un commentaire
	public void mange(){
		this.etat=true;
	}
	
	// FIXME écrire un commentaire
	public void estmange(){
		this.etat=false;
	}
	 
	// FIXME écrire un commentaire
	// FIXME remplacer par un vrai constructeur
	public Fantome(){
		this.vitesse = 4;
		this.x = 10;
		this.y = 6;
		this.etat = true;
	}
	
	
	

}
