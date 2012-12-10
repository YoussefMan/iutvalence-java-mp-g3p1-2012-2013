package fr.iutvalence.java.projets.Pacman;

import fr.iutvalence.java.projets.Pacman.Direction.Dir;

/**
 * @author elmanssy
 * 
 *         Cette classe permet de placer le pacman avec un couple x,y en abscisse ordonnée sur la grille.
 **/
/**
 * @author elmanssy
 *
 */
public class Position
{

	/**
	 * Placement en abscisse de l'objet.
	 */

	private int placementx;

	/**
	 * Placement en ordonnée de l'objet.
	 */
	private int placementy;

	/**
	 * On initialise la position de l'objet avec une valeur d'abscisse et d'ordonnée propre à chaque objet (x et y).
	 * 
	 * @param x
	 *            Le x représente la valeur d'abscisse pour la position de l'objet
	 * @param y
	 *            Le y représente la valeur d'ordonnée pour la position de l'objet
	 */
	public Position(int x, int y)
	{
		this.placementx = x;
		this.placementy = y;
	}

	public Position translation (Dir d)
	{
		if(d == Dir.haut){
			return new Position(this.placementx, this.placementy + 1);	
	}
		if(d == Dir.bas){
			return new Position(this.placementx, this.placementy - 1);	
	}    
		if(d == Dir.droite){
		return new Position(this.placementx + 1, this.placementy );	
	}
		else {
	return new Position(this.placementx - 1, this.placementy );	
		}
		
	}
	
	/**
	 * Cette méthode renvoit la valeur de x.
	 */
	public int getX()
	{
		return placementx;
	}

	/**
	 * Cette méthode renvoit la valeur de y.
	 */
	public int getY()
	{
		return placementy;
	}
	
	/**
	 * c'est le setter pour modifier le x
	 * @param x
	 */
	public void setX(int x)
	{
		this.placementx=x;
	}
	
	/**
	 * c'est le setter pour modifier le y
	 * @param y
	 */
	public void setY(int y)
	{
		this.placementy=y;
	}
	
	//s FIXME ce n'est pas la redéfinition de toString()
	public String tostring()
	{
		return "(" + this.placementx + "," + this.placementy + ")";
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o)
	{
		if (o == null)
			return false;
		if (o == this)
			return true;
		if (!(o instanceof Position))
			return false;
		Position temp = (Position) o;
		return (this.placementx == temp.placementx) && (this.placementy == temp.placementy);
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode()
	{
		return this.placementx + this.placementy;
	}

}
