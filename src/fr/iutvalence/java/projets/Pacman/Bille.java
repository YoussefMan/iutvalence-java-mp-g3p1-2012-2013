package fr.iutvalence.java.projets.Pacman;
/**
 * Ici cette classe eprmet de définir une bille, la bille est l'objet présent sur 
 * la zone de jeu jouable et qui rapporte des points dans la partie.
 * 
 * @author elmanssy
 *
 */
//  
public class Bille {
	
	
	
	
	
	/**
	 * Cette attribut permet de définir le nombre de point que rapporte une bille
	 */
	private int scoreBille;
	
	
	/**
	 * Ce booléen représente l'état de la bille pour savoir si elle est mangée ou pas par 
	 * le pacman
	 */
	private boolean Etat;
	
	/**
	 * Ici on cherche à savoir si une bille est mangée ou pas, l'attribut estmangee permet 
	 * de savoir si on est à false de dire que la bille est mangée
	 */
	
	public void estmangee(){
		this.Etat = false;
	}
	
	
	/**
	 * Si la bille n'est pas encore mangée on met l'état de la bille à true il sera modifié dans la gestion de partie.
	 */
	public void nonmangee(){
		this.Etat = true;
	}
	
	
	
	/**
	 * initialisation d'une bille avecn ce constructeur que donne à la bille deux attributs de base,
	 * l'état de la bille à true (Nonmangee) et scorebille à 10
	 *  
	 */
	public Bille(){
		this.Etat = true;
		this.scoreBille = 10;
	}

}
