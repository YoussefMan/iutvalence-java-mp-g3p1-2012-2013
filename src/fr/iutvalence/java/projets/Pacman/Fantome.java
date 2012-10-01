package fr.iutvalence.java.projets.Pacman;

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
	
	private boolean etat; 
	private static int nbFantome = 4;
	private int vitesse;
	private int x;
	private int y;
	
	
	public void mange(){
		this.etat=true;
	}
	public void estmange(){
		this.etat=false;
	}
	 
	public void fantome(){
		this.vitesse = 4;
		this.x = 10;
		this.y = 6;
		this.etat = true;
	}
	
	
	

}
