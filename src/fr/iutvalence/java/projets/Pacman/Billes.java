package fr.iutvalence.java.projets.Pacman;

// FIXME corriger le commentaire
/**
 * bille : ce que doit manger le pacman pour augementer le score;
 * carré : change l'état des fantome;
 * Etat : visible ou non;
 * 
 * @author elmanssy
 *
 */
// FIXME réfléchir à la egstion bille/billes 
public class Billes {
	
	// FIXME écrire un commentaire
	private int billes;
	
	// FIXME écrire un commentaire
	private int scoreBille;
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	private boolean Etat;
	//aa
	// FIXME écrire un commentaire
	public void estmangee(){
		this.Etat = false;
	}
	
	// FIXME écrire un commentaire
	public void nonmangee(){
		this.Etat = true;
	}
	
	// FIXME écrire un commentaire
	// FIXME remplacer par un vrai constructeur
	// FIXME placer le constructeur avant les méthodes
	public void Billes(){
		this.Etat = true;
		this.scoreBille = 10;
	}

}
