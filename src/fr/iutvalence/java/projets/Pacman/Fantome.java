package fr.iutvalence.java.projets.Pacman;

/**
 * Cette classse définit un fantome. Le fantôme est l'entité qui peut manger 
 * le pacman mais qui peux être mangé s'il devient faible. Il est défini par sa position,
 * son état et sa vitesse.
 * @author elmanssy
 *
 */

public class Fantome {
	
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
	
	
	// FIXME déplacer les définitions des constantes avant celles des attributs
	
	
	/**
	 * Vitesse par défaut du fantome
	 */
	// FIXME respecter les conventions d'écriture
	private final static int VITESSEINIT = 4;
	
	/**
	 * Position en abscisse par défaut du fantome
	 */
	// FIXME respecter les conventions d'écriture
	private final static int XFINIT = 10;
	
	/**
	 * Position en ordonnée par défaut du fantome
	 */
	// FIXME respecter les conventions d'écriture
	private final static int YFINIT = 6;
	

	/**
	 * Définit le placement du fantôme.
	 */
	// FIXME respecter les conventions d'écriture
	Position PlacementF;
	
	 
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
