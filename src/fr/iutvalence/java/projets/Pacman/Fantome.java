package fr.iutvalence.java.projets.Pacman;

/**
 * Cette classse définit un fantome. Le fantôme est l'entité qui peut manger le pacman mais qui peux être mangé s'il
 * devient faible. Il est défini par sa position, son état et sa vitesse.
 * 
 * @author elmanssy
 * 
 */

public class Fantome
{

	/**
	 * Vitesse par défaut du fantome
	 */
	public final static int VITESSE_INIT = 4;


	/**
	 * Permet de savoir si le fantome peut se faire manger ou pas. Si l'état est à false il peut se faire manger par le
	 * pacman sinon c'est lui qui peut mange le pacman
	 * 
	 */
	private boolean mangeable;

	/**
	 * Vitesse du fantome.
	 */
	private int vitesse;

	/**
	 * Définit le placement du fantôme.
	 */
	Position placementF;

	/**
	 * Ce constructeur permet d'initialiser un fantome, par sa vitesse sa position en abscisse,ordonnée et son état de
	 * base est prédateur. Le fantome créé dispose: - d'une vitesse égale pour tout les fantomes - Une position de base
	 * sur le plateau de jeu(xF,yF) - et un etat initiliser tout d'abord prédateur.
	 */
	public Fantome(int x, int y)
	{
		this.vitesse = VITESSE_INIT;
		this.placementF = new Position(x, y);
		this.mangeable = true;
	}

	/**
	 * Mettre le fantôme en état de prédateur.
	 */
	public void mange()
	{
		this.mangeable = true;
	}

	/**
	 * Cette methode permet de modifier l'état du fantome et de le mettre en état de victime. Quand un fantôme est
	 * mangé, on lui laisse un certain temps (à définir) pour le repositionner dans sa position de base.On fait ça pour
	 * ne pas perdre la couleur du fantôme en quelque sorte tant que la partie n'est pas fini le fantôme est immortel.
	 */
	public void estmange()
	{
		this.mangeable = false;
	}
	
	/**
	 * Cette méthode retourne la position du fantome.
	 * @return
	 */
	public Position getPosition()
	{
		return this.placementF;
	}

}
