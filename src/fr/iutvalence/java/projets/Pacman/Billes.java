package fr.iutvalence.java.projets.Pacman;
/**
 * bille : ce que doit manger le pacman pour augementer le score;
 * carré : change l'état des fantome;
 * Etat : visible ou non;
 * 
 * @author elmanssy
 *
 */
public class Billes {
	
	private int billes;
	private int scoreBille;
	private boolean Etat;
	public void estmanger(){
		this.Etat = false;
	}
	
	public void nonmanger(){
		this.Etat = true;
	}
	public void Billes(){
		this.Etat = true;
		this.scoreBille = 10;
	}

}
