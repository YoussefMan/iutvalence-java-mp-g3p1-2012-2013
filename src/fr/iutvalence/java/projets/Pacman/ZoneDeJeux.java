package fr.iutvalence.java.projets.Pacman;


/**
 * l'emplacement (0,0) se trouve en bas à gauche.
 * la grille fait en taille XMAX et YMAX.
 * Cette grille permet de modéliser la zone de jeu, elle est remplit de 0 et de 1 représentant
 * les zones jouables ou non jouables, elle est complété grace au constructeur Zone de base.
 * @author elmanssy
 *
 */
// FIXME(FIXED) respecter les conventions d'écriture
public class ZoneDeJeux {

	/**
	 * Cet attribut permet de définir le nombre de point que rapporte une bille
	 */
	// FIXME(FIXED) le score associé à une bille chage t'il durant la partie ?
	public final static int VALEURSCOREBILLE = 10;
	
	/**
	 * Cet attribut permet de définir le nombre de point que rapporte une gomme on gérera
	 * le fait que les fontôme change d'état quand une gomme est manger dans l'état de la partie.
	 */
	// FIXME(FIXED) le score associé à une bille chage t'il durant la partie ?
	public final static int VALEURSCOREGOMME = 50;
	
	

	// FIXME(FIXED) définir une "vraie" constante 
	// FIXME(FIXED) respecter les conventions d'écriture
	/**
	 * On définit à 1 les endroits où les déplacements d'objets sont autorisés
	 */
	public final static int ZONEJOUABLE = 1;

	// FIXME(FIXED) définir une "vraie" constante
	// FIXME(FIXED) respecter les conventions d'écriture
	/**
	 * On définit à 0 les endroits où les déplacements d'objets sont non autorisés
	 */
	public final static int ZONENONJOUABLE = 0;
	
	// FIXME(FIXED) écrire un commentaire
	/**
	 * Le contenue de la grille. (Chaque case peut contenir une bille et est une zone jouable ou non jouable).
	 */
	private int grille[][] ;
	
	// FIXME(FIXED) respecter les conventions d'écriture
	/**
	 * On définit à 20 la taille maximum de la grille en abscisse.
	 */
	private static final int XMAX = 20;
	// FIXME(FIXED) respecter les conventions d'écriture
	/** 
	 * la taille maximum de la grille en ordonnée.
	 * 	 */
	private static final int YMAX = 10;
	
	// FIXME(FIXED) écrire un commentaire
	// FIXME(FIXED) initialisation des attributs dans le constructeur
	/**
	 * represente l'abscisse sur la zone de jeu 
	 */
	private int x;
	
	// FIXME(FIXED) écrire un commentaire
	// FIXME(FIXED) initialisation des attributs dans le constructeur
	/**
	 * represente l'ordonée sur la zone de jeu 
	 */
	private int y;
	
	// FIXME(FIXED) écrire un commentaire
	// FIXME(FIXED) remplacer par un "vrai" constructeur
	/**
	 * On initialise une zone de jeux de taille XMAX en abscisse et YMAX en ordonnée
	 * avec des zones de jeux jouable et non jouable 
	 */
	public ZoneDeJeux(){
		x=0;
		y=0;
		
		while((x<XMAX))//On rempit toute la grille de zone jouable
			while((y<YMAX))
				grille[x][y] = 1 +  VALEURSCOREBILLE;
		    	y = y + 1;
		    x = x + 1;
		    
		while(x < XMAX) // On remplit en zone non jouable la première ligne et la dernière
			grille[x][1] = 0;
			grille[x][YMAX] = 0; 
			x = x + 1;
		
		while(y < YMAX) // On remplit en zone non jouable la première ligne et la dernière
			grille[XMAX][y] = 0;
			grille[1][y] = 0; 
			y = y + 1;
			
			grille[2][2] = 0; //Zone non jouable : (2;2,2;4)
			grille[2][3] = 0; 
			grille[2][4] = 0; 
			
			grille[2][6] = 0; //Zone non jouable : (2;6,2;8)
			grille[2][7] = 0; 
			grille[2][8] = 0; 
			
			grille[4][2] = 0;//Zone non jouable : (4;2,7;2)
			grille[5][2] = 0;
			grille[6][2] = 0;
			grille[7][2] = 0;
			
			grille[13][2] = 0;//Zone non jouable : (13;2,16;2)
			grille[14][2] = 0;
			grille[15][2] = 0;
			grille[16][2] = 0;
			
			grille[18][2] = 0; //Zone non jouable : (18;2,18;4)
			grille[18][3] = 0; 
			grille[18][4] = 0; 
			
			grille[18][6] = 0; //Zone non jouable : (18;6,18;8)
			grille[18][7] = 0; 
			grille[18][8] = 0; 
			
			grille[4][8] = 0;//Zone non jouable : (4;8,7;8)
			grille[5][8] = 0;
			grille[6][8] = 0;
			grille[7][8] = 0;
			
			grille[13][8] = 0;//Zone non jouable : (13;8,16;8)
			grille[14][8] = 0;
			grille[15][8] = 0;
			grille[16][8] = 0;
			
			x = 0;
			y = 0;
			
			grille[1][1] = 0; // On met en place la valeur des gommes.
			grille[1][1] = 1 + VALEURSCOREGOMME;
			
			grille[19][1] = 0; // On met en place la valeur des gommes.
			grille[19][1] = 1 + VALEURSCOREGOMME;
			
			grille[19][9] = 0; // On met en place la valeur des gommes.
			grille[19][9] = 1 + VALEURSCOREGOMME;
			
			grille[1][9] = 0; // On met en place la valeur des gommes.
			grille[1][9] = 1 + VALEURSCOREGOMME;
			
	}
}
