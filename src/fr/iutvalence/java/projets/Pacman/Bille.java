package fr.iutvalence.java.projets.Pacman;

/**
 * Cette classe définit une bille, la bille est l'objet présent sur la zone de
 * jeu jouable et qui rapporte des points dans la partie.
 * 
 * @author elmanssy
 * 
 */
//
public class Bille {

	/**
	 * Cet attribut permet de définir le nombre de point que rapporte une bille
	 */
	// FIXME respecter les conventions d'écriture
	public final static int VALEURSCOREBILLE = 10;

	// FIXME détailler le commentaire (à quel état correspond true ?)
	/**
	 * L'état de la bille (mangée ou pas)
	 */
	private boolean etat;

	/**
	 * La variable qui reçoit le score de la bille
	 */
	// FIXME le score associé à une bille change t'il durant la partie ?
	private int scorebille;

	/**
	 * Création d'une bille initialement non mangée, de score égal à la valeur
	 * par défaut.
	 * 
	 */
	public Bille() {
		this.etat = true;
		this.scorebille = VALEURSCOREBILLE;
	}

	/**
	 * Déclarer la bille comme mangée
	 */
	public void estmangee() {
		this.etat = false;
	}

	/**
	 * Déclarer la bille comme non mangée
	 */
	public void nonmangee() {
		this.etat = true;
	}

}
