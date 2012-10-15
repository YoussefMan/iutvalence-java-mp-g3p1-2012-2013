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
	private final static int VITINIT = 10;
	
	/**
	 * Nombre de vie initiale du pacman.
	 */
	private final static int NBVIEINIT = 3;
	
	/**
	 * Position en abscisse par défaut du pacman
	 */
	private final static int XPINIT = 10;
	
	/**
	 * Position en ordonnée par défaut du pacman
	 */
	private final static int YPINIT = 2;
	
	// FIXME (FIXED) rester synthétique, réduire le commentaire 
	/**
	 * attribut Vitesse du pacman qui reçoit la vitesse initiale du pacman.
	 */
	// FIXME(Fixed) la vitesse change t'elle en cours de partie
	private int vitesse;
	
	
	// FIXME(FIXED)détailler le commentaire, c'est très ambigü
	// FIXME(FIXED) pourquoi prtected ? (à discute en séance)
	/**
	 * Le nombre de vie du pacman. 
	 */
	private int nbVies; 
	 
	// FIXME(FIXED)préciser à quelle valeur booléenne correspond l'état "en vie" 
	/**
	 * Etat du pacman (mort ou pas). True : Le pacman est en vie.
	 * False : le pacman est mort.
	 */
	private boolean etat;
	
	
	
	
	/**
	 * Définit le placement du pacman.
	 */
	private Position PlacementPM; 
	
	// FIXME(FIXED) remplacer par un "vrai" constructeur
	// FIXME(FIXED) placer le constructeur avant les méthodes
	/**
	 *  Ce constructeur permet d'initialiser le pacman, par sa vitesse sa position en abscisse,ordonnée
	 *  et son état de base est vivant mais il peut etre victime des autres fantomes.
	 * Le Pacman créé dispose: -d'une vitesse légerment supérieur à celle des fantomes
	 * 							-Une position de base sur le plateau de jeu.
	 * 							-et un etat initiliser tout d'abord "peut manger des billes).
	 */
	public Pacman(){
		this.PlacementPM = new Position(XPINIT,YPINIT);
	    this.vitesse = VITINIT;
		this.nbVies = NBVIEINIT;
		this.etat = true;
	}
	


	// FIXME(FIXED) écrire le commentaire différemment (la première phrase est ambigüe-
	/**
	 * On définit les actions à faire quand le pacman est mort : 
	 * 1) L'état devient false ("est mort")
	 * 2) On le replace au centre de la grille
	 * 3) Décremente le nombre de vie 
	 */
	public void mort(){
		this.etat = false;
		this.PlacementPM = new Position(XPINIT,YPINIT);
		this.nbVies = this.nbVies -1;
	}
	
	// FIXME(FIXED) écrire un commentaire
	/**
	 * Le pacman peut se déplacer et manger des billes
	 */
	public void vivant(){
		this.etat = true;
	}
	

}

