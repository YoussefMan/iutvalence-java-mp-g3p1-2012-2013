package fr.iutvalence.java.projets.Pacman;

/**
 * @author elmanssy
 *	
 * Cette classe permet de placer le pacman avec un couple x,y en abscisse ordonnée sur la grille.
 **/
public class Position {
	

	// FIXME(FIXED) écrire le commentaire proprement 
 /**
 * Placement en abscisse de l'objet.
 */
public int placementx;

// FIXME(FIXED) écrire le commentaire proprement
/**
 * Placement en ordonnée de l'objet.
 */
public int placementy;

//FIXME(FIXED) écrire un commentaire
/**
 * On initilaise la position de l'objet avec une valeur d'abscisse et d'ordonnée propre à chaque objet (x et y).
 * @param x Le x représente la valeur d'abscisse pour la position de l'objet
 * @param y Le y représente la valeur d'ordonnée pour la position de l'objet
 */
public Position(int x, int y){
	this.placementx = x;
	this.placementy = y;
	// FIXME(FIXED) compléter
}

// FIXME(FIXED) écrire le commentaire
/**
 * Cette méthode renvoit la valeur de x.
 */
public int getX(){
	return  placementx;
}

// FIXME(FIXED) écrire le commentaire
/**
 * Cette méthode renvoit la valeur de y.
 */
public int getY(){
	return  placementy;
}




}
