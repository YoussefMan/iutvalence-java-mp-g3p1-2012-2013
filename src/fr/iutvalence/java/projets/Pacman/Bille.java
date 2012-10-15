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
	// FIXME(FIXED) le score associé à une bille chage t'il durant la partie ?
	public final static int VALEURSCOREBILLE = 10;
	
	/**
	 * L'état de la bille (mangée ou pas) 
	 */
	// FIXME(FIXED) respecter les conventions d'écriture
	private boolean etat;
	
	/**
	 * La varible qui reçoit le score de la bille
	 */
	private int scorebille;

	
	// FIXME(FIXED) corriger le commentaire (donner des informations sur l'état de la bille créée, sans mentionner explicitement les attributs)
	/**
	 * initialisation d'une bille avecn ce constructeur que donne à la bille deux attributs de base,
	 * l'état de la bille (si elle est encore presente ou pas) et le score que raporte la bille qui prend pour valeur 
	 * VALEURSCOREBILLE
	 *  
	 */
	public Bille(){
		this.etat = true;
		// FIXME(FIXED) définir la valeur par défaut sous la forme d'une constante
		this.scorebille = VALEURSCOREBILLE;
	}

	// FIXME(FIXED) déplacer les méthodes après le(s) constructeur(s)
		// FIXME(FIXED) le commentaire ne correspond pas à l'implémentation de la méthode
		/**
		 * On change l'état de la bille quand elle est mangée.
		 */
		
		public void estmangee(){
			this.etat = false;
		}
		
		
		
	// FIXME(FIXED) corriger le commentaire (ne pas indiquer à quelle condition on appelle la méthode mais pltot à quoi elle sert)
		/**
		 * On initialise l'état de la bille en debut de partie
		 */
		public void nonmangee(){
			this.etat = true;
		}
			

		
	
	
	
}
