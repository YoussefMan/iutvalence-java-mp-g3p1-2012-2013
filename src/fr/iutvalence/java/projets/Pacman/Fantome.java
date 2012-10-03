package fr.iutvalence.java.projets.Pacman;

// FIXME corriger le problèmes de caractères accentués, utiliser UTF-8 comme encodage dans les propriétés du projet
/**
 * 
 * @author elmanssy
 *
 */
public class Fantome {
	
	
	/**
	 * Cette variable permet de savoir si le fantome peut se faire manger ou pas.
	 */
	private boolean etat; 
	
<<<<<<< HEAD

	
	/**
	 * 
	 */
	
=======
	// FIXME écrire un commentaire
	// FIXME définir une vraie constante
	private static int nbFantome = 4;
>>>>>>> branch 'master' of https://github.com/sebastienjean/iutvalence-java-mp-g3p1-2012-2013.git
	
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
