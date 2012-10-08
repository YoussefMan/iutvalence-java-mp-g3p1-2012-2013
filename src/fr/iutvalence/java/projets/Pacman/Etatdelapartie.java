package fr.iutvalence.java.projets.Pacman;

// FIXME compléter le commentaire
/**
 * 
 * @author elmanssy
 * 
 */
// FIXME renommer la classe
public class Etatdelapartie {

	//FIXME renommer la constante
	private static final int NBFANTOME = 4;
	// perso = new Pacman();

	//FIXME duplicata ?
	private final static int NBFANTOME = 4;
	
	
	// FIXME écrire un commentaire
	// FIXME initialiser l'attribut dans le constructeur
	private double timer = 0.1;
	
	// FIXME écrire un commentaire
	// FIXME initialiser de l'attribut dans le constructeur
	private int nbNiveau = 5;

	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	private int nombredebilles;

	// FIXME écrire un commentaire
	private int score;

	// FIXME écrire un commentaire
	// FIXME remplacer par un "vrai" constructeur
	public void initPartie() {
		
		// FIXME définir la valeur par défaut sous la forme d'une constante
		this.nombredebilles = 50;
		this.score = 0;
	}

	// FIXME écrire un commentaire
	public Etatdelapartie() {
		
		while (perso.vie > 0) {

		}

	}

	// FIXME autres méthodes ?
}
