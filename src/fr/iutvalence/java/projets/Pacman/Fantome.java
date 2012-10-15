package fr.iutvalence.java.projets.Pacman;

/**
 * Cette classse définit un fantome. Le fantôme est l'entité qui peut manger 
 * le pacman mais qui peux être mangé s'il devient faible. Il est défini par sa position,
 * son état et sa vitesse.
 * @author elmanssy
 *
 */

public class Fantome {
	
	// FIXME(FIXED) préciser (c'est ambigü) quelle valeur de l'état correspond à "je peux me faire manger"
	/**
	 * Permet de savoir si le fantome peut se faire manger ou pas. 
	 * Si l'état est à false il peut se faire manger par le pacman sinon
	 * c'est lui qui peut mange le pacman
	 * 
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
	
	// FIXME(FIXED) regrouper les 2 composantes x et y dans un seul objet (à définir)
	/**
	 * Définit le placement du fantôme.
	 */
	Position PlacementF;
	
	 
	// FIXME(FIXED) corriger le commentaire (indiquer les caractéristiques du fantome créé)
	// FIXME(FIXED) déplacer le constructeur avant les méthodes
	/**
	 * Ce constructeur permet d'initialiser un fantome, par sa vitesse sa position en abscisse,ordonnée
	 * et son état de base est prédateur.
	 * Le fantome créé dispose: - d'une vitesse égale pour tout les fantomes
	 * 							- Une position de base sur le plateau de jeu(xF,yF)
	 * 							- et un etat initiliser tout d'abord prédateur.
	 */ 
	public Fantome(){
		this.vitesse = VITESSEINIT;
		this.PlacementF = new Position(XFINIT,YFINIT);
		this.etat = true;
	}
	

	/**
	 * Mettre le fantôme en état de prédateur.
	 */
	public void mange(){
		this.etat=true;
	}
	
	// FIXME(FIXED) quand un fantôme est mangé, il disparait pour reapparaitre plus tard ? (à discuter en séance)
	
	/**
	 * Cette methode permet de modifier l'état du fantome et de le mettre en état de victime.
	 * Quand un fantôme est mangé, on lui laisse un certain temps (à définir) pour le repositionner 
	 * dans sa position de base.On fait ça pour ne pas perdre la couleur du fantôme en quelque sorte tant que 
	 * la partie n'est pas fini le fantôme est immortel.
	 */
	public void estmange(){
		this.etat=false;
	}
	

}
