package fr.iutvalence.java.projets.Pacman;
/**
 * Cette classe définit une bille, la bille est l'objet présent sur 
 * la zone de jeu jouable et qui rapporte des points dans la partie.
 * 
 * @author elmanssy
 *
 */
//  
public class Bille {
	
	/**
	 * Cet attribut permet de définir le nombre de point que rapporte une bille
	 */
	// FIXME le score associé à une bille chage t'il durant la partie ?
	private int scoreBille;
	
	/**
	 * L'état de la bille (mangée ou pas) 
	 */
	// FIXME respecter les conventions d'écriture
	private boolean Etat;
	
	
	// FIXME déplacer les billes après le(s) constructeur(s)
	// FIXME le commentaire ne correspond pas à l'implémentation de la méthode
	/**
	 * Ici on cherche à savoir si une bille est mangée ou pas, l'attribut estmangee permet 
	 * de savoir si on est à false de dire que la bille est mangée
	 */
	
	public void estmangee(){
		this.Etat = false;
	}
	
	// FIXME corriger le commentaire (ne pas indiquer à quelle condition on appelle la méthode mais pltot à quoi elle sert)
	/**
	 * Si la bille n'est pas encore mangée on met l'état de la bille à true il sera modifié dans la gestion de partie.
	 */
	public void nonmangee(){
		this.Etat = true;
	}
	
	
	// FIXME corriger le commentaire (donner des informations sur l'état de la bille créée, sans mentionner explicitement les attributs)
	/**
	 * initialisation d'une bille avecn ce constructeur que donne à la bille deux attributs de base,
	 * l'état de la bille à true (Nonmangee) et scorebille à 10
	 *  
	 */
	public Bille(){
		this.Etat = true;
		// FIXME définir la valeur par défaut sous la forme d'une constante
		this.scoreBille = 10;
	}

}
