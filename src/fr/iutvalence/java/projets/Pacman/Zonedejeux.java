package fr.iutvalence.java.projets.Pacman;

// FIXME compléter le commentaire
/**
 * l'emplacement (0,0) se trouve en bas à gauche.
 * la grille fait en taille XMAX et YMAX.
 * @author elmanssy
 *
 */
// FIXME respecter les conventions d'écriture
public class Zonedejeux {

	
	// FIXME définir une "vraie" constante
	// FIXME respecter les conventions d'écriture
	private static int zonejouable = 1;

	// FIXME définir une "vraie" constante
	// FIXME respecter les conventions d'écriture
	private static int zonenonjouable = 0;
	
	// FIXME écrire un commentaire
	private int grille[][] ;
	
	// FIXME respecter les conventions d'écriture
	private static final int Xmax = 20;
	// FIXME respecter les conventions d'écriture
	private static final int Ymax = 10;
	
	// FIXME écrire un commentaire
	// FIXME initialisation des attributs dans le constructeur
	private int x = 0;
	
	// FIXME écrire un commentaire
	// FIXME initialisation des attributs dans le constructeur
	private int y = 0;
	
	// FIXME écrire un commentaire
	// FIXME remplacer par un "vrai" constructeur
	public void ZoneDeBase(){
		
		while((x<Xmax))//On rempit toute la grille de zone jouable
			while((y<Ymax))
				grille[x][y] = 1;
		    	y = y + 1;
		    x = x + 1;
		    
		while(x < Xmax) // On remplit en zone non jouable la première ligne et la dernière
			grille[x][1] = 0;
			grille[x][Ymax] = 0; 
			x = x + 1;
		
		while(y < Ymax) // On remplit en zone non jouable la première ligne et la dernière
			grille[Xmax][y] = 0;
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
	}
}
