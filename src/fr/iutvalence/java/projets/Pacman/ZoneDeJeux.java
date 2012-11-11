package fr.iutvalence.java.projets.Pacman;

import java.util.Arrays;

/**
 * l'emplacement (0,0) se trouve en bas à gauche. la grille fait en taille XMAX et YMAX. Cette grille permet de
 * modéliser la zone de jeu, elle est remplit de 0 et de 1 représentant les zones jouables ou non jouables, elle est
 * complété grace au constructeur Zone de base.
 * 
 * @author elmanssy
 * 
 */
public class ZoneDeJeux
{

	/**
	 * Cet attribut permet de définir le nombre de point que rapporte une bille
	 */
	public final static int VALEUR_SCORE_BILLE = 10;

	/**
	 * Cet attribut permet de définir le nombre de point que rapporte une gomme on gérera le fait que les fontôme change
	 * d'état quand une gomme est manger dans l'état de la partie.
	 */
	public final static int VALEUR_SCORE_GOMME = 50;

	/**
	 * On définit à 1 les endroits où les déplacements d'objets sont autorisés
	 */
	public final static int ZONE_JOUABLE = 1;

	/**
	 * On définit à 0 les endroits où les déplacements d'objets sont non autorisés
	 */
	public final static int ZONE_NON_JOURABLE = 0;

	/**
	 * On définit à 20 la taille maximum de la grille en abscisse.
	 */
	public static final int X_MAX = 21;

	/**
	 * la taille maximum de la grille en ordonnée.
	 * 
	 * */
	public static final int Y_MAX = 11;

	/**
	 * Le contenu de la grille. (Chaque case peut contenir une bille et est une zone jouable ou non jouable).
	 */
	private int grille[][];

	/**
	 * Le compteur du nombre de bille qu'il reste sur la grille
	 */
	private int compteur_bille;

	/**
	 * Le compteur du nombre de gomme qu'il reste sur la grille
	 */
	private int compteur_gomme;
	/**
	 * represente l'abscisse sur la zone de jeu
	 */
	private int x;

	/**
	 * represente l'ordonée sur la zone de jeu
	 */
	private int y;

	/**
	 * On initialise une zone de jeux de taille XMAX en abscisse et YMAX en ordonnée avec des zones de jeux jouable et
	 * non jouable
	 */
	public ZoneDeJeux()
	{
		grille = new int[X_MAX][Y_MAX];
		x = 0;
		y = 0;

		while ((this.y < Y_MAX))
		{// On rempit toute la grille de zone jouable

			while (this.x < X_MAX)
			{

				this.grille[this.x][this.y] = VALEUR_SCORE_BILLE;
				this.x++;
			}
			x = 0;
			this.y++;
		}

		x = 0;
		y = 0;
		while (this.x < X_MAX)
		{ // On remplit en zone non jouable la première ligne et la dernière
			this.grille[this.x][0] = 0;
			this.grille[this.x][Y_MAX - 1] = 0;
			this.x = this.x + 1;
		}

		while (this.y < Y_MAX)
		{ // On remplit en zone non jouable la première colonne et la dernière
			this.grille[X_MAX - 1][this.y] = 0;
			this.grille[0][this.y] = 0;
			this.y = this.y + 1;
		}

		// On remplie de zone non jouable la 2 ème ligne pour crée des murs.
		this.grille[2][2] = 0;
		this.grille[3][2] = 0;
		this.grille[4][2] = 0;
		this.grille[5][2] = 0;
		this.grille[6][2] = 0;
		this.grille[7][2] = 0;
		this.grille[8][2] = 0;

		this.grille[9][2] = 0;
		this.grille[11][2] = 0;
		this.grille[12][2] = 0;
		this.grille[13][2] = 0;
		this.grille[14][2] = 0;
		this.grille[15][2] = 0;
		this.grille[16][2] = 0;
		this.grille[17][2] = 0;
		this.grille[18][2] = 0;

		// On remplie de zone non jouable la 8 ème ligne pour crée des murs.

		this.grille[2][8] = 0;
		this.grille[3][8] = 0;
		this.grille[4][8] = 0;
		this.grille[5][8] = 0;
		this.grille[6][8] = 0;
		this.grille[7][8] = 0;
		this.grille[8][8] = 0;

		this.grille[9][8] = 0;
		this.grille[11][8] = 0;
		this.grille[12][8] = 0;
		this.grille[13][8] = 0;
		this.grille[14][8] = 0;
		this.grille[15][8] = 0;
		this.grille[16][8] = 0;
		this.grille[17][8] = 0;
		this.grille[18][8] = 0;

		this.grille[2][3] = 0;
		this.grille[2][4] = 0;
		this.grille[2][6] = 0;
		this.grille[2][7] = 0;

		this.grille[4][4] = 0;
		this.grille[5][4] = 0;
		this.grille[6][4] = 0;
		this.grille[7][4] = 0;
		this.grille[8][4] = 0;

		this.grille[12][4] = 0;
		this.grille[13][4] = 0;
		this.grille[14][4] = 0;
		this.grille[15][4] = 0;
		this.grille[16][4] = 0;

		this.grille[4][6] = 0;
		this.grille[5][6] = 0;
		this.grille[6][6] = 0;
		this.grille[7][6] = 0;
		this.grille[8][6] = 0;

		this.grille[12][6] = 0;
		this.grille[13][6] = 0;
		this.grille[14][6] = 0;
		this.grille[15][6] = 0;
		this.grille[16][6] = 0;

		this.grille[10][4] = 0;
		this.grille[10][5] = 0;
		this.grille[10][6] = 0;

		this.grille[18][3] = 0;
		this.grille[18][4] = 0;
		this.grille[18][6] = 0;
		this.grille[18][7] = 0;

		this.x = 0;
		this.y = 0;

		this.grille[1][1] = 0; // On met en place la valeur des gommes.
		this.grille[1][1] = VALEUR_SCORE_GOMME;

		this.grille[19][1] = 0; // On met en place la valeur des gommes.
		this.grille[19][1] = VALEUR_SCORE_GOMME;

		this.grille[19][9] = 0; // On met en place la valeur des gommes.
		this.grille[19][9] = VALEUR_SCORE_GOMME;

		this.grille[1][9] = 0; // On met en place la valeur des gommes.
		this.grille[1][9] = VALEUR_SCORE_GOMME;

	}

	/**
	 * On récupére le nombre de bille en traverssant toute la zone de jeu et en les comptants.
	 * 
	 * @return
	 */
	public int getBilles()
	{
		x = 0;
		y = 0;

		compteur_bille = 0;

		while ((this.y < Y_MAX))
		{// On rempit toute la grille de zone jouable

			while (this.x < X_MAX)
			{

				if (this.grille[this.x][this.y] == VALEUR_SCORE_BILLE)
					compteur_bille++;

				this.x++;
			}
			x = 0;
			this.y++;
		}
		return compteur_bille;
	}

	/**
	 * On récupére le nombre de gommes en traverssant toute la zone de jeu et en les comptants.
	 * 
	 * @return
	 */
	public int getGommes()
	{
		x = 0;
		y = 0;

		compteur_gomme = 0;
		while ((this.y < Y_MAX))
		{// On rempit toute la grille de zone jouable

			while (this.x < X_MAX)
			{

				if (this.grille[this.x][this.y] == VALEUR_SCORE_GOMME)
					compteur_gomme++;
				this.x++;
			}
			x = 0;
			this.y++;
		}
		return compteur_gomme;
	}

	public String toString()
	{

		String nL1 = System.getProperty("line.separator");
		this.x = 0;
		this.y = 0;
		int nbbilles;
		int nbgommes;
		String result = "Voici la zone de jeu : \n";
		while (this.y < Y_MAX)
		{

			x = 0;

			while (this.x < X_MAX)
			{
				if (this.grille[this.x][this.y] == 0)
					result += "*";

				if (this.grille[this.x][this.y] == VALEUR_SCORE_GOMME)
					result += "0";
				if (this.grille[this.x][this.y] == VALEUR_SCORE_BILLE)
					result += "o";
				this.x = this.x + 1;

			}
			result += "\n";
			this.y = this.y + 1;
		}
		nbbilles = getBilles();
		nbgommes = getGommes();
		result += "il y a " + nbbilles + " billes et " + nbgommes + " gommes";
		return result;
	}

}
