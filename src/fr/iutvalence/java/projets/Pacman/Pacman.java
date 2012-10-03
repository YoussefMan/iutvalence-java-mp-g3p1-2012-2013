package fr.iutvalence.java.projets.Pacman;


/**
 * On modélise ici le personnage principale de type pacman, il peut se déplacer soit de façon manuelle soit de façon automatique.
 * Le personnage peut se déplacer à gauche ,
 *  à droite, en haut et en bas. Il peut être détruit par des fantômes(voir classe Fantome)
 * @author elmanssy
 *
 */
public class Pacman {
	
	
	/**
	 * Ici ce paramêtre permet de modifier et de définir la vitesse du pacman.
	 */
	private int vitesse;
	
	
	/**
	 * Ici cette attribut permet de définir la vie initiale du pacman. 
	 */
	protected int vie; 
	
	
	
	 
	/**
	 * Cette variable permet de savoir si le pacman est mort ou pas.
	 */
	private boolean etat;
	
	/**
	 * C'est la position en abscisse par défault du pacman
	 */
	private final static int XPINIT = 10;
	
	/**
	 * C'est la position en ordonnée par défault du pacman
	 */
	private final static int YPINIT = 2;
	

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

