package fr.iutvalence.java.projets.Pacman;


/**
 * On modélise ici le personnage principal (Pacman). Pacman peut se déplacer à gauche ,
 *  à droite, en haut et en bas. Il peut être détruit par des fantômes.
 * @author elmanssy
 *
 */
public class Pacman {
	
	
	// FIXME (FIXED) rester synthétique, réduire le commentaire 
	/**
	 * Vitesse du pacman.
	 */
	// FIXME la vitesse change t'elle en cours de partie
	private int vitesse;
	
	
	// FIXME détailler le commentaire, c'est très ambigü
	// FIXME pourquoi prtected ? (à discute en séance)
	/**
	 * Ici cette attribut permet de définir la vie initiale du pacman. 
	 */
	protected int vie; 
	 
	// FIXME préciser à quelle valeur booléenne correspond l'état "en vie" 
	/**
	 * Etat du pacman (mort ou pas).
	 */
	private boolean etat;
	
	
	
	/**
	 * Position en abscisse par défaut du pacman
	 */
	private final static int XPINIT = 10;
	
	/**
	 * Position en ordonnée par défaut du pacman
	 */
	private final static int YPINIT = 2;
	

	// FIXME écrire le commentaire différemment (la première phrase est ambigüe-
	/**
	 * Cette méthode permet de définir l'état mort du pacman, elle fait trois actions, 
	 * elle le met en état mort, puis elle le replace au centre de la grille puis elle décremente
	 * la variable vie.
	 */
	public void mort(){
		this.etat = false;
		this.placementxPM = XPINIT;
		this.placementyPM = YPINIT;
		this.vie = this.vie -1;
	}
	
	// FIXME écrire un commentaire
	/**
	 * 
	 */
	public void vivant(){
		this.Etat = true;
	}
	
	// FIXME remplacer par un "vrai" constructeur
	// FIXME placer le constructeur avant les méthodes
	/**
	 * 
	 */
	public void pacman(){
		this.placementxPM =10; 
		this.placementyPM = 2;
		this.vitesse = 10;
		this.vie = 3;
		this.Etat = true;
	}
	

}

