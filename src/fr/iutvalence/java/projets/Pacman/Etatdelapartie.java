package fr.iutvalence.java.projets.Pacman;

/**
 * 
 * @author elmanssy
 * 
 */
// FIXME est ce vraiment de l'heritage ?
public class Etatdelapartie extends Pacman {

	// FIXME écrire un commentaire
	private double timer = 0.1;

	// FIXME écrire un commentaire
	private int nombredebilles;

	// FIXME écrire un commentaire
	private int score;

	// FIXME écrire un commentaire
	// FIXME remplacer par un "vrai" constructeur
	public void initPartie() {
		this.nombredebilles = 50;
		this.score = 0;
	}

	// FIXME écrire un commentaire
	public Etatdelapartie() {
		Pacman perso = new Pacman();
		while (perso.vie > 0) {

		}

	}

	// FIXME autres méthodes ?
}
