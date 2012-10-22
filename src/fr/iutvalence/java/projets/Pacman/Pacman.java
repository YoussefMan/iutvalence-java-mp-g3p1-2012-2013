package fr.iutvalence.java.projets.Pacman;


/**
 * On modélise ici le personnage principal (Pacman). Pacman peut se déplacer à gauche ,
 *  à droite, en haut et en bas. Il peut être détruit par des fantômes.
 * @author elmanssy
 *
 */
public class Pacman {
	
	/**
	 * Vitesse initiale du pacman.
	 */
	// FIXME(FIXED) respecter les conventions d'écriture
	public final static int VITINIT = 10;
	
	/**
	 * Nombre de vie initiale du pacman.
	 */
	// FIXME(FIXED) respecter les conventions d'écriture
	public final static int NBVIEINIT = 3;
	
	/**
	 * Position en abscisse par défaut du pacman
	 */
	// FIXME(FIXED) respecter les conventions d'écriture
	public final static int XPINIT = 10;
	
	/**
	 * Position en ordonnée par défaut du pacman
	 */
	// FIXME(FIXED) respecter les conventions d'écriture
	public final static int YPINIT = 2;
	 
	/**
	 * vitesse du pacman.
	 */
	// FIXME(FIXED) la vitesse change t'elle en cours de partie ?
	private final int vitesse;
	
	
	/**
	 * Le nombre de vies du pacman. 
	 */
	private int nbVies; 
	 
	/**
	 * Etat du pacman (mort ou pas). True : Le pacman est en vie.
	 * False : le pacman est mort.
	 */
	private boolean etat;
	
	
	
	/**
	 * Définit le placement du pacman.
	 */
	// FIXME(FIXED) respecter les conventions d'écriture
	private Position placementPM; 
	
	
	/**
	 *  Ce constructeur permet d'initialiser le pacman, par sa vitesse sa position en abscisse,ordonnée
	 *  et son état de base est vivant mais il peut etre victime des autres fantomes.
	 * Le Pacman créé dispose: -d'une vitesse légerment supérieur à celle des fantomes
	 * 							-Une position de base sur le plateau de jeu.
	 * 							-et un etat initiliser tout d'abord "peut manger des billes).
	 */
	public Pacman(){
		this.placementPM = new Position(XPINIT,YPINIT);
	    this.vitesse = VITINIT;
		this.nbVies = NBVIEINIT;
		this.etat = true;
	}
	


	/**
	 * On définit les actions à faire quand le pacman est mort : 
	 * 1) L'état devient false ("est mort")
	 * 2) On le replace au centre de la grille
	 * 3) Décremente le nombre de vie 
	 */
	public void mort(){
		this.etat = false;
		this.placementPM = new Position(XPINIT,YPINIT);
		this.nbVies = this.nbVies -1;
	}
	
	/**
	 * Le pacman peut se déplacer et manger des billes
	 */
	public void vivant(){
		this.etat = true;
	}
	

}

