package fr.iutvalence.java.projets.Pacman;

// FIXME corriger le problèmes de caractères accentués, utiliser UTF-8 comme encodage dans les propriétés du projet
/**
 * Les fantÃ´mes possedent 2 etat celui de prÃ©dateur et celui de victime.
 * state = Ã©tat du fantome.
 * x : l'emplacement du fantome en abscisse;
 * y : l'emplacement du fantome en ordonnÃ©e;
 * dx : dÃ©placement en abscisse;
 * dy: dÃ©placement en ordonnÃ©e;
 * nbfantome: nombre de fantome prÃ©sent sur le plateau;
 * vitesse : vitesse de deplacement fantome;
 * 
 * @author elmanssy
 *
 */
public class Fantome {
	
	// FIXME écrire un commentaire
	private boolean etat; 
	
	// FIXME écrire un commentaire
	// FIXME définir une vraie constante
	private static int nbFantome = 4;
	
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
	public void fantome(){
		this.vitesse = 4;
		this.x = 10;
		this.y = 6;
		this.etat = true;
	}
	
	
	

}
