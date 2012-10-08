package fr.iutvalence.java.projets.Pacman;

/**
 * Cette classse définit un fantome. Le fantôme est l'entité qui peut manger 
 * le pacman mais qui peux être mangé s'il devient faible. Il est défini par sa position,
 * son état et sa vitesse.
 * @author elmanssy
 *
 */

public class Fantome {
	
	// FIXME préciser (c'est ambigü) quelle valeur de l'état correspond à "je peux me faire manger"
	/**
	 * Permet de savoir si le fantome peut se faire manger ou pas.
	 */
	private boolean etat; 
	
	/**
	 * Vitesse du fantome.
	 */
	private int vitesse;
	
	/**
	 * Vitesse par défaut du fantome
	 */
	private final static int VITESSEINIT = 4;
	
	/**
	 * Position en abscisse par défaut du fantome
	 */
	private final static int XFINIT = 10;
	
	/**
	 * Position en ordonnée par défaut du fantome
	 */
	private final static int YFINIT = 6;
	
	// FIXME regrouper les 2 composantes x et y dans un seul objet (à définir)
	/**
	 * Position en abscisse du fantôme dans la grille.
	 */
	private int xF;
	
	
	/**
	 * Position en ordonnée du fantôme dans la grille.
	 */
	private int yF;
	
	
	/**
	 * Mettre le fantôme en état de prédateur.
	 */
	public void mange(){
		this.etat=true;
	}
	
	// FIXME quand un fantôme est mangé, il disparait pour reapparaitre plus tard ? (à discuter en séance)
	/**
	 * Cette methode permet de modifier l'état du fantome et de le mettre en état de victime.
	 */
	public void estmange(){
		this.etat=false;
	}
	 
	// FIXME corriger le commentaire (indiquer les caractéristiques du fantome créé)
	// FIXME déplacer le constructeur avant les méthodes
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
