package fr.iutvalence.java.projets.Pacman;

/**
 * Cette classse  permet de définir ce qu'est un fantome, il est l'entité qui peut manger 
 * le pacman mais qui peux être manger si il devient faible.Il est défini par 4 attributs, la position en x,y,
 * son état et sa vitesse.
 * @author elmanssy
 *
 */

public class Fantome {
	
	
	/**
	 * Cette variable permet de savoir si le fantome peut se faire manger ou pas.
	 */
	private boolean etat; 
	

	
	
	/**
	 * Cette variable définit la vitesse du fantome.
	 */
	private int vitesse;
	
	/**
	 * C'est la vitesse par défault du fantome
	 */
	private final static int VITESSEINIT = 4;
	
	/**
	 * C'est la position en abscisse par défault du fantome
	 */
	private final static int XFINIT = 10;
	
	/**
	 * C'est la position en ordonnée par défault du fantome
	 */
	private final static int YFINIT = 6;
	
	
	/**
	 * Cette variable définit la position en abscisse du fantôme dans la grille.
	 */
	private int xF;
	
	
	/**
	 * Cette variable définit la position en ordonnée du fantôme dans la grille.
	 */
	private int yF;
	
	
	/**
	 * Cette methode permet de modifier l'état du fantome et de le mettre en état de prédateur.
	 */
	public void mange(){
		this.etat=true;
	}
	
	
	/**
	 * Cette methode permet de modifier l'état du fantome et de le mettre en état de victime.
	 */
	public void estmange(){
		this.etat=false;
	}
	 
	/**
	 * Ce constructeur permet d'initialiser un fantome, par sa vitesse sa position en abscisse,ordonnée
	 * et son état de base est prédateur.
	 */ 
	public Fantome(){
		this.vitesse = VITESSEINIT;
		this.xF =  XFINIT;
		this.yF = YFINIT;
		this.etat = true;
	}
	
	
	

}
